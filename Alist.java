import java.util.ArrayList;
import java.util.Scanner;
public class Alist
{
	public static void main(String args[])
	{
		ArrayList<String> car=new ArrayList<String>();
int n,i=0;
		car.add("City");
		car.add("Virtus");
		car.add("Verna");
		car.add("Swift");
		car.add("Fortuner");
		car.add("Innova");
		car.add("Invicto");
n=car.size();
while(i<n)
{
		System.out.println(car.get(i));
i=i+1;}

}
}
