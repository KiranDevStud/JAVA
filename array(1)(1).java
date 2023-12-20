import java.util.Scanner;
public class array
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
float sum=0;int n;
System.out.println("Enter array size");
n=in.nextInt();
float arr[]=new float[n];
System.out.println("Enter array elements:");
for(int i=0;i<n;i++)
{arr[i]=(float)in.nextInt();
sum=sum+arr[i];}
System.out.println("Average of the array set:"+sum/n);
}
}
