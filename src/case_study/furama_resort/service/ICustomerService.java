package case_study.furama_resort.service;

import case_study.furama_resort.model.Customer;

public interface ICustomerService extends Service{
    void display();
    void add(Customer customer);
    Customer findById(String id);
    void updateFile(Customer customer);
}
