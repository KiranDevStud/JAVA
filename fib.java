public class fib
{
public static void main(String args[])
{
long count=0,n1,n2,n3;
System.out.println("First Hundred Fibnocci numbers");
n1=0;n2=1;
System.out.print(n1+"\n"+n2+"\n");
while(count<48)
{
n3=n1+n2;
System.out.println(n3+" ");
n1=n2;
n2=n3;
count++;
}
}
}

