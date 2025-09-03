package case_study.furama_resort.service;

import case_study.furama_resort.controller.EmployeeController;
import case_study.furama_resort.model.Employee;
import case_study.furama_resort.repository.EmployeeRepository;
import case_study.furama_resort.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void display() {
        List<Employee> employeeList = employeeRepository.getEmployeeList();
        if (employeeList.isEmpty()) {
            System.out.println("Danh sách nhân viên trống");
        } else {
            System.out.println("---Danh sách nhân viên---");
            for (Employee employee : employeeList) {
                System.out.println(employee);
            }

        }
    }
    public void add(Employee employee){
        employeeRepository.add(employee);
        System.out.println("Add employee successfully");
    }

    @Override
    public void updateFile(Employee employeeEdit) {
        employeeRepository.updateFile(employeeEdit);
        System.out.println("Update successfully");
    }

    @Override
    public Employee findById(String id) {
        return employeeRepository.findById(id);
    }
}
