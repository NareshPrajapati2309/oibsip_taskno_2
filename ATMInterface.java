package IS;

import java.util.Scanner;

public class ATMInterface {

    public static void main(String args[]) {

        int balance = 1000000, w, d; // Withdraw = w, & Deposite = d

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to ATM Machine\n");
            System.out.println("Select Option 1 for withdraw");
            System.out.println("Select Option 2 for deposit");
            System.out.println("Select Option 3 for Check Balance");
            System.out.println("Select Option 4 for EXIT\n");
            System.out.print("Select Option the operation which you want:");

            // get choice from user
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    w = sc.nextInt();
                    if (balance >= w) {
                        balance = balance - w;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:

                    System.out.print("Enter money to be deposited:");
                    d = sc.nextInt();
                    balance = balance + d;
                    System.out.println("Your Money has been successfully depsited");
                    System.out.println("");
                    break;

                case 3:

                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
            System.out.println("In Your account after the process balance is " + balance);
            System.out.println("Thank You From ATM ");
        }

    }
}