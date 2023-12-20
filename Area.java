import java.util.*;
class Area
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int m,n,o;
System.out.println("Enter lenght ,breadth and height:");
m=in.nextInt();
n=in.nextInt();
o=in.nextInt();
Box ob=new Box();
ob.setval(m,n,o);
System.out.println("The volume of the box with length "+m+" ,breadth "+n+" , and width "+o+"="+ob.area());
}
}

