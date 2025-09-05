package case_study.furama_resort.repository;

import case_study.furama_resort.model.Customer;

import java.util.List;

public interface ICustomerRepository extends IRepository {
    List<Customer> getCustomerList();
    boolean add(Customer customer);
    Customer findById(String id);
    void updateFile(Customer customer);
}
