import java.util.Scanner;
import java.lang.Math;
public class narc
{
public static void main(String args[])
{
double n,res=0,temp,m,mm,count=0;
Scanner in=new Scanner(System.in);
System.out.println("Enter  a number");
n=in.nextDouble();
m=n;
mm=n;
while(n!=0)
{
count++;
n=n/10;
}
while(mm!=0)
{
temp=mm%10;
res=res+(Math.pow(temp,count));
mm=mm/10;
}
if(m==res)
System.out.println(m+" is a narcissistic number");
else 
System.out.println(m+" is not a narcissistic number");
}
}
