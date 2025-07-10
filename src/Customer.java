public class Customer {

    private long number;
    private String name;
    private Car car;

    public Customer(String name,long number,Car car){
        this.name = name;
        this.number = number;
        this.car = car;
    }

    public long getNumber() {
        return number;
    }



    public String getName() {
        return name;
    }



    public Car getCar() {
        return car;
    }


}
