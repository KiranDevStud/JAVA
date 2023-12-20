import java.util.Scanner;
public class oddeven
{
public static void main (String args[])
{
int n;
Scanner in =new Scanner(System.in);
System.out.println("Enter a number");
n=in.nextInt();
 if(n%2==0)
System.out.println(n+" is even\n");
else 
System.out.println(n+" is odd");
}}
