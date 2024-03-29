//Using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        // Task for the thread to execute
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class RunnableExample {
    public static void main(String args[]) {
        
        MyRunnable myRun1 = new MyRunnable();
        MyRunnable myRun2 = new MyRunnable();

        Thread t1 = new Thread(myRun1, "January 1st is Monday");
        Thread t2 = new Thread(myRun2, "January 2nd is Tuesday");

        t1.start();
        t2.start();
    }
}
