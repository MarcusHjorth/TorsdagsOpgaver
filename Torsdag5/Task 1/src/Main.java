import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer>customers = new ArrayList<>();

        Customer customer1 = new Customer("Chad", "Goodman", "xXDragonSlayerXx");
        Customer customer2 = new Customer("Olaf", "Rasmussen", "Nissemand");
        customers.add(customer1);
        customers.add(customer2);

        for (Customer i : customers) {
            System.out.println(i);
        }
    }
}