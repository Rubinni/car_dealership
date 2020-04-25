public class DealerShip {

    public static void main(String [] args){

        Customer customer = new Customer("Nitsuh","sumit",1200);

        Employee emp = new Employee("mik",2421);

        Vehicle vehicle = new Vehicle("Toyota","dolfin","black","mini"
        ,1000,155665);

        customer.purchaseCar(vehicle,emp,false);



        /*
            handleCustomer (Customer cust, boolean funance, Vehicle vehicle)
                if(finance == true)
                    runCraditHistory(Customer cust, double doubleAmount)
                 else if(vehicle.getPrice() <= cust.getCashOnHand)
                    processTransaction(Customer cust,Vehicle vehicle)
                 else
                        tell customer to bring more cash
         */


    }

}
