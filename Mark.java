import java.util.Scanner;

interface Sortable {
    public void sort(int ar[], int n);
}

class BubbleSort implements Sortable {
    public void sort(int ar[], int n) {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}

class Print {
    void printarray(int ar[], int n) {
        int i;
        for (i = 0; i < n; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}

class BinarySearch {
    void pos(int ar[], int mark) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == mark) {
                System.out.println("Position: " + (i + 1));
                return; 
            }
        }
        System.out.println("Mark not found in the array.");
    }
}

public class Mark {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n, arr[];
        System.out.println("Enter size of the array:");
        n = in.nextInt();
        arr = new int[n];
        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        System.out.println("Sorted Marks:");
        BubbleSort ob1 = new BubbleSort();
        Print ob2 = new Print();
        BinarySearch ob3 = new BinarySearch();
        ob1.sort(arr, n);
        ob2.printarray(arr, n);
        System.out.println("Enter mark to search:");
        int mark = in.nextInt();
        ob3.pos(arr, mark);
    }
}
