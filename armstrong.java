import java.util.Scanner;
public class armstrong
{
public static void main(String args[])
{
int n,res=0,temp,m;
Scanner in=new Scanner(System.in);
System.out.println("Enter  a number");
n=in.nextInt();
m=n;
while(n!=0)
{
temp=n%10;
res=res+(temp*temp*temp);
n=n/10;
}
if(m==res)
System.out.println(m+" is an armstrong number");
else 
System.out.println(m+" is not an armstrong number");
}
}
