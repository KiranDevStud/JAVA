import java.util.Scanner;
public class calender
{
public static void main(String args[])
{
int n,no;
Scanner in=new Scanner(System.in);
int m[]={31,28,31,30,31,30,31,31,30,31,30,31};
String month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
System.out.println("\tMenu\n1. Number of days in a given month\n2.list of months with 31 days\n3.List of months with 30 days\nEnter your choice");
n=in.nextInt();
System.out.println("You have selected:");
switch (n)
{
case 1:
{System.out.println("No of days in a given month");
System.out.println("Enter the number corresponding to the month");
no=in.nextInt();
System.out.println("Month="+month[no-1]);
System.out.println("Days="+m[n+1]);
break;
}
case 2:
{System.out.print("List of months with 31 days:\nMonths:");
for(int i=0;i<12;i++)
if(m[i]==31)
System.out.print(" "+month[i]);
break;}
case 3:
{System.out.print("List of months with 30 days:\nMonths:");
for(int i=0;i<12;i++)
if(m[i]==30)
System.out.print(" "+month[i]);
break;}
}
}
}
