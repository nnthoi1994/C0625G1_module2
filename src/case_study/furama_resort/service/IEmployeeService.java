package case_study.furama_resort.service;

import case_study.furama_resort.model.Employee;

import java.util.List;

public interface IEmployeeService extends Service{
    void display();
    void add(Employee employee);
    Employee findById(String id);
    void updateFile(Employee employee);
}
