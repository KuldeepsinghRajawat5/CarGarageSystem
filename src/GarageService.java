import java.util.*;

public class GarageService {
    private Map<String,Customer> customerMap;
    private List<Service> availableServices;

    public GarageService(){
        this.customerMap = new HashMap<>();
        this.availableServices = new ArrayList<>();
        loadService();
    }

    public void loadService(){
        availableServices.add(new Service("Car Wash", 500));
        availableServices.add(new Service("Car Paint", 1000));
        availableServices.add(new Service("Car Alignment",5000));
        availableServices.add(new Service("Car Oiling",700));
        availableServices.add(new Service("puncher",50));
    }

    public void addCustomer(String name, long phone,String carNumber,String model){
        Car car = new Car(carNumber, model);
        Customer customer = new Customer(name,phone,car);
        customerMap.put(carNumber,customer);
        System.out.println("Customer Added Successfully!");
    }

    public void createInvoice(String carNumber) {
        if (!customerMap.containsKey(carNumber)) {
            System.out.println("No Customer Found with car Number: " + carNumber);
            return;
        }
        Scanner sc = new Scanner(System.in);
        Customer customer = customerMap.get(carNumber);
        Invoices invoices = new Invoices(customer);
        System.out.println("Available Services:");
        for (int i = 0; i < availableServices.size(); i++) {
            System.out.println((i + 1) + ". " + availableServices.get(i).getName()
                    + " - $ " + availableServices.get(i).getPrice());
        }
        while (true) {
            System.out.println("Enter Service number to add or 0 to finish");
            int choice = sc.nextInt();
            if (choice == 0) break;
            if (choice > 0 && choice <= availableServices.size()) {
                invoices.addService(availableServices.get(choice - 1));
                System.out.println("Service Done");

            } else {
                System.out.println("Invalid Choice.");
            }

        }
        invoices.printInvoice();
    }
}
