import Abstract.BaseCustomerManager;
import Concrete.CustomerCheckManager;
import Concrete.SturbucksCustomerManager;
import Entities.Customer;

public class Main {
    public static void main(String[] args) {

        BaseCustomerManager customerManager = new SturbucksCustomerManager(new CustomerCheckManager());
        customerManager.save(new Customer(1, "kra", "uy", 2001, "12345678910"));

    }
}