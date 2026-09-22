import java.util.Scanner;

class Nantha{

    
    static double balance = 200000.0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

       
            System.out.println("\n--- BANKING MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    deposit(sc);
                    break;
                case 2:
                    withdraw(sc);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our services. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
         

        sc.close();
    }

    
    public static void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
            System.out.println("Updated Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    
    public static void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance! Current balance is: ₹" + balance);
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew ₹" + amount);
            System.out.println("Updated Balance: ₹" + balance);
        }
    }

    
    public static void checkBalance() {
        System.out.println("Current Account Balance: ₹" + balance);
    }
}