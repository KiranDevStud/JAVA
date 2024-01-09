package account;
import java.util.Scanner;

public class accbal {
    private double balance;

    public void setBalance() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the balance: Rs ");
        this.balance = scanner.nextDouble();
    }

    public void show() {
        System.out.println("Balance: Rs " + this.balance);
    }
}
