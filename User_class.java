import java.util.Scanner;

class User_class {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Bank_Management_system user =
                new Bank_Management_system("Kamala", 7708950374L, 1000.0);

        System.out.println("Your Account Created Successfully");
        System.out.println("Your PIN is: " + user.getPin());

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Update Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    double withdrawAmount = sc.nextDouble();
                    System.out.print("Enter PIN: ");
                    int pin = sc.nextInt();
                    user.withdraw(withdrawAmount, pin);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double depositAmount = sc.nextDouble();
                    user.deposit(depositAmount);
                    break;

                case 3:
                    user.checkBalance();
                    break;

                case 4:
                    user.updateDetails();
                    break;

                case 5:
                    System.out.println("Thank you for using Bank System");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}