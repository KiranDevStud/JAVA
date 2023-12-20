import java.util.Scanner;

class area {
    float Area(float r,double pi,int n) {
        return (float) (pi*Math.pow(r,n));
    }

    float Area(float b, float h) {
        return (float) ((1.0 / 2.0) * b * h);
    }

    float Area(int n) {
        return  (n*n);
    }
}

public class Areas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, ch;
        float height, breadth, radius;
        m = 4;
        area ob = new area();

        System.out.println("Menu");
        System.out.println("1. Area of circle");
        System.out.println("2. Area of triangle");
        System.out.println("3. Area of square");
        System.out.println("Enter your choice:");
        ch = in.nextInt();

        switch (ch) {
            case 1:
                {
                    float r;
                    System.out.println("Enter radius:");
                    r = in.nextFloat();
double pi=Math.PI;
int n=2;
                    System.out.println("Area of circle=" + ob.Area(r,pi,n));
                    break;
                }
            case 2:
                {
                    float b, h;
                    System.out.println("Enter base and height:");
                    b = in.nextFloat();
                    h = in.nextFloat();
                    System.out.println("Area of triangle=" + ob.Area(b, h));
                    break;
                }
            case 3:
                {
                    int r;
                    System.out.println("Enter side of square:");
                    r = in.nextInt();
                    System.out.println("Area of ssquare=" + ob.Area(r));
                    break;
                }
            default:
                System.out.println("INVALID INPUT");
        }
    }
}

