package Adaptorler;




import Abstract.ICustomerCheckService;
import Entities.Customer;


public class MernisServiceAdapter implements ICustomerCheckService {


    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return customer.getNationalityId().length() >= 11 || customer.getNationalityId().length() <= 11;
    }
}
