import java.util.Scanner;
public class calculator
{public static void main(String args[])
{Scanner in=new Scanner(System.in);
float m,n;
double result;
char ch;
System.out.println("\tCalculator");
System.out.println("Enter calculator operation(+,-,*,/,%)");
ch=in.next().charAt(0);
System.out.println("Enter two numbers to do "+ch);
m=in.nextFloat();
n=in.nextFloat();
switch (ch)
{
case '+':
	result=m+n;
System.out.println(result);
	break;
case '-':
	result=m-n;
System.out.println(result);
	break;
case '*':
	result=m*n;
System.out.println(result);
	break;
case '/':
	result=m/n;
System.out.println(result);
	break;
case '%':
	result=m%n;
System.out.println(result);
	break;
default:
	break;

}

}
}
