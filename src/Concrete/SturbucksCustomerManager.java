package Concrete;

import Abstract.BaseCustomerManager;

import Abstract.ICustomerCheckService;
import Entities.Customer;

public class SturbucksCustomerManager extends BaseCustomerManager {


    private ICustomerCheckService customerCheckService;

    public SturbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }



    @Override
    public void Save(Customer customer) {

    }
}
