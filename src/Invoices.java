import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class Invoices {

    private Customer customer;
    private List<Service> serviceList;
    private double totalAmount;

    public Invoices(Customer customer){
        this.customer = customer;
        this.serviceList = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addService(Service service){
        serviceList.add(service);
        totalAmount += service.getPrice();
    }

    public void printInvoice(){
        System.out.println("---------Invoice---------");
        System.out.print("customer: " + customer.getName()+ ", Phone: " + customer.getNumber());
        System.out.println("CarModel: " + customer.getCar().getModel()+", CarNumber: " + customer.getCar().getCarNumber());
        System.out.println("Services:");
        for(Service service : serviceList){
            System.out.println("$ " + service.getPrice());
        }

        System.out.println("Total Amount : " + totalAmount);
        System.out.println("---------Thank You---------");
    }

}
