import java.util.Scanner;
class Circle
{
	protected double radius;
    public Circle()
    {
        this.radius=1.0;
    }
    public Circle(double radius)
    {
        this.radius=radius;
     }
     double getRadius()
     {
         return radius;
      }
     double getArea()
     {
         return Math.PI*radius*radius;
     }
}
class Cylinder extends Circle
{
    private double height;
    public Cylinder()
    {
        super();
        
        this.height=1.0;
    }
    public Cylinder(double radius,double height)
    {
        super(radius);
        this.height=height;
    }
    double getHeight()
    {
        return height;
    }
    double getVolume()
    {
        return Math.PI*radius*radius*height;
    }
    double getArea()
    {
        return 2*Math.PI*radius*(radius+height);
    }
}
class CircleCylinder{
public static void main(String args[])
{
    double r,h;
    Scanner in=new Scanner(System.in);
    System.out.println("Enter RADIUS of cicle and cylinder");
    r=in.nextDouble();
    Circle ob=new Circle(r);
    System.out.println("Radius="+ob.getRadius()+"\nArea="+ob.getArea());
    System.out.println("Enter heigth of cylinder");
    h=in.nextDouble();
    Cylinder ob1=new Cylinder(r,h);
    System.out.println("Radius="+ob1.getRadius()+"\nHeight="+ob1.getHeight()+"\nVolume="+ob1.getVolume()+"\nArea="+ob1.getArea());
}
}