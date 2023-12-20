import java.util.*;

class Fact {
    int n, res = 1;

    void getData(int num) {
        n = num;
    }

    int rec(int n) {
        if (n >= 1) {
            return n * rec(n - 1);
        } else {
            return 1;
        }
    }

    int ite(int n) {
        while (n >= 1) {
            res = res * n;
            n = n - 1;
        }
        return res;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = in.nextInt();
        Fact ob = new Fact();
        ob.getData(num);
        System.out.println("Factorial using recursion = " + ob.rec(ob.n));
        System.out.println("Factorial using iteration = " + ob.ite(ob.n));
    }
}


