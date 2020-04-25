import java.lang.invoke.VarHandle;

public class Employee {

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public void handleCoustomer(Customer customer, Vehicle vehicle, boolean finance){
            if(finance == true){
                double loneAmount = vehicle.getPrice() - customer.getCashOnHand();
                runCraditHistory(customer,loneAmount);
            }else if(vehicle.getPrice() <= customer.getCashOnHand() ){
                processTransaction(customer,vehicle);
            }else{
                System.out.println("Bring More Cash" + vehicle);
            }
    }

    private void processTransaction(Customer customer, Vehicle vehicle) {
        System.out.println("Customer have purchased  the vehicle " +
                vehicle + "for the price " + vehicle.getPrice());
    }

    private void runCraditHistory(Customer cust, double loneAmount) {
        System.out.println("Run Cradit card history...");
        System.out.println("Customer have been approved to purchase the vehicle");
    }

}
