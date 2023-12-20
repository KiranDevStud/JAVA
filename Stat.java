import java.util.Scanner;

class StatCalc {
    int n;
    int[] ar;
    int i = 0;

    StatCalc(int nn) {
        n = nn;
        ar = new int[n];
    }

    void enter(int num) {
        if (i >= n) {
            System.out.println("Out of bounds, cannot add more items.");
            return;
        }
        else 
	    {ar[i] = num;}
	    i++;
    }

    int getcount() {
        return i; 
    }

    int getsum() {
        int sum = 0;
        for (int j = 0; j <i; j++) {
            sum += ar[j];
        }
        return sum;
    }

    float getmean() {
        int mean = 0;
        for (int j = 0; j <i; j++) {
            mean += ar[j];
        }
        return (float) mean / (i + 1); 
    }

    float getStandardDeviation() {
        double sum = 0.0;
        int array_length = i + 1; 
        for (int j = 0; j <i; j++) {
            sum += ar[j];
        }
        double mean = sum / array_length;
        double standard_deviation = 0.0;
        for (int j = 0; j <i; j++) {
            standard_deviation += Math.pow(ar[j] - mean, 2);
        }
        double result = Math.sqrt(standard_deviation / array_length);
        return (float) result;
    }
}

class Stat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len, ch, item;
        System.out.println("Enter array size");
        len = in.nextInt();
        StatCalc ob = new StatCalc(len);
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu");
            System.out.println("1. Enter an item");
            System.out.println("2. Get count");
            System.out.println("3. Get sum");
            System.out.println("4. Get mean");
            System.out.println("5. Get standard deviation");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");
            ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter an item:");
                    item = in.nextInt();
                    ob.enter(item);
                    break;
                case 2:
                    System.out.println("Length of the array: " + ob.getcount());
                    break;
                case 3:
                    System.out.println("Sum = " + ob.getsum());
                    break;
                case 4:
                    System.out.println("Mean = " + ob.getmean());
                    break;
                case 5:
                    System.out.println("Standard deviation = " + ob.getStandardDeviation());
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("INVALID INPUT");
            }
        }
    }
}