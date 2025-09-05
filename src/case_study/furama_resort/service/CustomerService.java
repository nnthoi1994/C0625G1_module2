package case_study.furama_resort.service;

import case_study.furama_resort.model.Customer;
import case_study.furama_resort.repository.CustomerCustomerRepository;
import case_study.furama_resort.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService{
    private ICustomerRepository customerRepository = new CustomerCustomerRepository();
    @Override
    public void display() {
      List<Customer> customerList = customerRepository.getCustomerList();
      if(customerList.isEmpty()){
          System.out.println("Customer list is empty");
      } else {
          System.out.println("---Customer List---");
          for (Customer customer : customerList){
              System.out.println(customer);
          }
      }
    }

    @Override
    public void add(Customer customer) {
customerRepository.add(customer);
        System.out.println("Add customer successfully");
    }

    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public void updateFile(Customer customerEdit) {
        customerRepository.updateFile(customerEdit);
        System.out.println("Update successfully");
    }
}
