import java.util.Scanner;

public class GarageBillingApp {
    public static void main(String[] args) {
        GarageService garageService = new GarageService();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("----------Bharti Car Services Center----------");
            System.out.println("1. Add Customer");
            System.out.println("2. Services Offering.");
            System.out.println("3. Exit");
            System.out.println("Enter Your Choice");


            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter Customer Name:");
                    String name = sc.next();
                    System.out.println("Enter Phone Number");
                    long phone = sc.nextLong();
                    System.out.println("Enter Car Number");
                    String carNumber = sc.next();
                    System.out.println("Enter Car Model");
                    String model = sc.next();
                    garageService.addCustomer(name,phone,carNumber,model);
                    break;
                case 2 :
                    System.out.println("Enter Car number:");
                    String carNo = sc.next();
                    garageService.createInvoice(carNo);
                    break;
                case 3:
                    System.out.println("Exiting.... thank You");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice Try Again");
            }
        }
    }
}
