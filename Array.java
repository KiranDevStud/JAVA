import java.util.*;
class Arr
{
    void show(int n[])
    {
	System.out.print("Array elements:");
        for(int i=0;i<n.length;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
}
class Array
{
    public static void main(String args[])
    {
        int n,x[];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array:");
        n=in.nextInt();
        x=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        x[i]=in.nextInt();
        Arr ob=new Arr();
        ob.show(x);
    }
}
