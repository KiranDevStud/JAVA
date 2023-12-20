import java.util.Scanner;

interface Volume {
    Scanner in = new Scanner(System.in);
    double pi = 3.14;

    void readData();

    double displayVolume();
}

class Sphere implements Volume {
    int radius;

    public void readData() {
        System.out.println("Enter radius");
        radius = in.nextInt();
    }

    public double displayVolume() {
        return (4.0 / 3.0) * pi * radius * radius * radius;
    }
}

class Cylinder implements Volume {
    int radius, height;

    public void readData() {
        System.out.println("Enter radius");
        radius = in.nextInt();
        System.out.println("Enter height");
        height = in.nextInt();
    }

    public double displayVolume() {
        return pi * radius * radius * height;
    }
}

class InterVolume {
    public static void main(String args[]) {
        Sphere obs = new Sphere();
        Cylinder obc = new Cylinder();

        obs.readData();
        System.out.println("Volume of sphere = " + obs.displayVolume());

        obc.readData();
        System.out.println("\nVolume of cylinder = " + obc.displayVolume());
    }
}

