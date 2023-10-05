package Task1;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();

        customers.add(new Customer("Mikkel", "Den", "Slemme", 1));
        customers.add(new Customer("Lukas", "Den", "Seje", 2));
        customers.add(new Customer("Patrick", "Den", "Farlige", 3));

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer currentCustomer : customers) {
            System.out.println(currentCustomer);
        }
    }
}