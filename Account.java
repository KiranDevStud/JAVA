import java.util.Scanner;

class Det {
    Scanner in = new Scanner(System.in);
    long acno;
    float bal;
    String name, type;

    Det(long an, float balance, String name1, String actype) {
        acno = an;
        bal = balance;
        name = name1;
        type = actype;
    }

    float dep() {
        System.out.println("Enter amount to deposit");
        float depositAmount = in.nextFloat();
        bal += depositAmount;
	System.out.println("Balance: "+bal);
        return bal;
    }

    float with() {
        System.out.println("Enter amount to withdraw");
        float withdrawalAmount = in.nextFloat();
        if (withdrawalAmount > bal) {
            System.out.println("Insufficient Balance!");
        } else {
            bal -= withdrawalAmount;
		System.out.println("Balance: "+bal);
        }
        return bal;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Type: " + type);
        System.out.println("Balance: " + bal);
	System.out.println("Account Type: "+type);
    }
}

class Account {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String aname, atype;
        long accno;
        System.out.println("Enter name");
        aname = in.nextLine();
        System.out.println("Enter account number");
        accno = in.nextLong();
        System.out.println("Enter account type");
        atype = in.next();
        Det ob = new Det(accno, 0, aname, atype);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n\tMENU");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            int ch = in.nextInt();
            switch (ch) {
                case 1: {
                    ob.dep();
                    break;
                }
                case 2: {
                    ob.with();
                    break;
                }
                case 3: {
                    ob.display();
                    break;
                }
                case 4: {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Invalid Input");
                    break;
                }
            }
        }
    }
}


