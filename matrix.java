import java.util.*;
public class matrix
{public static void main(String args[])
{
int r,c,sum=0,arr[][];
Scanner in=new Scanner(System.in);
System.out.println("Enter matrix size");
r=in.nextInt();
arr=new int[r][r];
System.out.println("Enter matrix elements:");
for(int i=0;i<r;i++)
for(int j=0;j<r;j++)
arr[i][j]=in.nextInt();

System.out.println("Entered matrix:");
for(int i=0;i<r;i++)
{for(int j=0;j<r;j++)
{System.out.print(arr[i][j]+" ");
if(i==j)
sum=sum+arr[i][j];}
System.out.println();
}
System.out.println("Sum of the main diagonal in the matrix is:"+sum);
}
}

