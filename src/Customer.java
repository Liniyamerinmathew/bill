import java.util.ArrayList;
import java.util.Scanner;
public class Customer{
    String name;
    Integer phoneNumber;
    Integer  Sum;

    public Customer(String name, Integer phoneNumber, Integer Sum) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.Sum = Sum;
    }

    public static void main(String[] args) {
        System.out.println("1. Generate bill");
        System.out.println("2. View all transaction");
        System.out.println("3. Exit");
        System.out.print("\nPlease enter the choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Generate_bill();
                break;
            case 2:
                View_all_transactions();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    }
