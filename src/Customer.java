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
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Customer> Customerlist = new ArrayList<Customer>();
    static String[] s = new String[] {"Tea-10" ,  "cofee-15  ","snacks-10","idly-8","dosha-6","Quit  "};
    static int[] rate = new int[]{10,15,10,8,6,0};
    static int[] qt = new int[6];
    static void Generate_bill(){
        System.out.print("Enter Customer name ");
        String name = sc.next();
        System.out.print("Enter phone number:");
        int phoneNumber = sc.nextInt();
        int sum=0;
        boolean quit=true;

        System.out.println("ITEM"+"\t\t\tPrice");

        for(int i =0; i<6;i++)
            System.out.println((i+1)+"."+s[i]);

        do{
            System.out.println( "Enter the item number");
            int ch=sc.nextInt();
            if(ch>0 && ch<6)
            {
                System.out.println("enter the no of quantites of "+s[ch-1]);
                int q=sc.nextInt();
                qt[ch-1]+=q;

            }
            else
            {
                quit=false;

            }

        }while(quit);
        System.out.println("Your Orders are:\n");
        int SUM=0;
        for(int i = 0; i<6; i++)
        {
            if(qt[i]!=0)
            {
                sum+=qt[i]*rate[i];
                System.out.println(s[i]+"*   "+qt[i]+"=="+qt[i]*rate[i]+"rs");
            }
            SUM=SUM+sum;
        }
        System.out.println("Your total bill="+SUM);

        System.out.println("Thank you");
        int Sum=SUM;

        Customer cu = new Customer(name,phoneNumber,Sum);
        Customerlist.add(cu);
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
