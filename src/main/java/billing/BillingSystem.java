package billing;

import java.util.Arrays;
import java.util.*;

public class BillingSystem {

    private int m_counter = 0;
    private static List<Customer> customers = new ArrayList<>();

    public int getCounters() {
        return customers.size();
    }
    
    public static void main(String[] args) {
        
        customers.add(new RegCustomer("Customer1",10));
        customers.add(new VipCustomer("Customer2", 20));
        customers.add(new RegCustomer("Customer3",50));
        customers.add(new VipCustomer("Customer4", 60));

        customers.get(0).addToBill(20);
        customers.get(1).addToBill(30);

        customers.forEach(a-> System.out.println(a.toString()));
    }
}
