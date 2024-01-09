class threadquestion extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]) {
        threadquestion t1 = new threadquestion();
        System.out.println("Name of thread 't1': " + t1.getName());

        threadquestion t2 = new threadquestion();
        System.out.println("Name of thread 't2': " + t2.getName());

        // Setting names before starting threads
        t1.setName("January 1st is Monday");
        t2.setName("January 2nd is Tuesday");

        // Starting threads after setting names
        t1.start();
        t2.start();

        System.out.println("New name of thread 't1': " + t1.getName());
        System.out.println("New name of thread 't2': " + t2.getName());
    }
}
