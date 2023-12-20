import java.util.*;
class Shape{
    float length,breadth,radius;
}
class rect extends Shape{
    rect(float l,float b)
    {
        length=l;
        breadth=b;
    }
    float rect_area()
    {
        return length*breadth;
    }
}
class circle extends Shape{
    circle(float r)
        {
            radius=r;
        }
        float circle_area()
        {
            return (radius*radius*(float)3.14);
        }
 }
 class square extends Shape{
        square(float lg)
        {
            length=lg;
        }
        float square_area()
        {
            return  length*length;
        }
    }
 public class area
{
public static void main(String args[])
{Scanner in=new Scanner(System.in);
    float lng,br,rs; 
    System.out.println("Enter length breadth and radius:");
    lng=in.nextFloat();
    br=in.nextFloat();
    rs=in.nextFloat();
    rect ob1=new rect(lng,br);
    System.out.println("Area of rectangle="+ob1.rect_area());
    circle ob2=new circle(rs);
    System.out.println("Area of circle="+ob2.circle_area());
    square ob3=new square(lng);
    System.out.println("Area of square="+ob3.square_area());
}
}