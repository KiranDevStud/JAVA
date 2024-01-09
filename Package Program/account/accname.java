package account;
import java.util.Scanner;

public class accname {
    private String name;

    public void setname() {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the name: ");
        this.name = in.nextLine();
    }

    public void show() {
        System.out.println(this.name);
    }
}
