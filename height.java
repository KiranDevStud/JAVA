import java.util.*;
public class height
{public static void main(String args[])
{int n,count=0;
float height[],weight[];;
height=new float[10];
weight=new float[10];
Scanner in=new Scanner(System.in);
System.out.println("Enter the height of 10 students:");
for(int i=0;i<10;i++)
height[i]=(float)in.nextFloat();
System.out.println("Enter the weight of 10 students:");
for(int i=0;i<10;i++)
weight[i]=(float)in.nextFloat();
System.out.println("Height and weight of 10 students:");
System.out.println("Height\tWeight");
for(int i=0;i<10;i++)
{System.out.println(height[i]+"\t"+weight[i]);
if((height[i]>160)&&(weight[i]>50))
count++;}
System.out.println("No of Students with height grater than 160cm and weight greater than 50kg:"+count);
}}
