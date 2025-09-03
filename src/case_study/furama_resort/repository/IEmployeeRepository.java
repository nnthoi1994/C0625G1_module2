package case_study.furama_resort.repository;

import case_study.furama_resort.model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> getEmployeeList();
    boolean add(Employee employee);
    Employee findById(String id);
    void updateFile(Employee employee);


}
