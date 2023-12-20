import java.util.Scanner;
class Rectangle
{ Scanner in=new Scanner(System.in);
	int length,breadth,area,perimeter;
	void read()
		{
System.out.println("Enter length and breadth:");
length=in.nextInt();
breadth=in.nextInt();
}
void calculate()
{
area=length*breadth;
perimeter=2*(length+breadth);
}
void display()
{
System.out.println("Area:"+area);
System.out.println("Perimeter:"+perimeter);
}}
class AreaRect{
public static void main(String args[])
{
Rectangle ob=new Rectangle();
ob.read();
ob.calculate();
ob.display();
}
}
