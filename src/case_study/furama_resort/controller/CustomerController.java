package case_study.furama_resort.controller;

import case_study.furama_resort.model.Employee;
import case_study.furama_resort.service.CustomerService;
import case_study.furama_resort.service.EmployeeService;
import case_study.furama_resort.service.ICustomerService;
import case_study.furama_resort.service.IEmployeeService;
import case_study.furama_resort.utils.ValidateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CustomerController {
    private static final ICustomerService customerService = new CustomerService();
    public static void displayCustomerMenu() {

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("\n--Employee Management MENU--");
            System.out.println("1.Display list employee");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Return main menu");
            System.out.println("Plese enter your choice");
            try {
//                choice = Integer.parseInt(scanner.nextLine());
//                switch (choice) {
//                    case 1:
//                        customerService.display();
//                        break;
//                    case 2:
//                        try {
//                            System.out.println("This is Add Employee function");
//                            String idEmployee;
//                            do {
//                                System.out.println("Enter idEmployee (Format NV-YYYY): ");
//                                idEmployee = scanner.nextLine();
//                                if (!ValidateUtils.isIdEmployee(idEmployee)) {
//                                    System.out.println("IdEmployee invalid, please re-enter");
//                                }
//                            }
//                            while (!ValidateUtils.isIdEmployee(idEmployee));
//
//                            String name;
//                            do {
//                                System.out.println("Enter name of employee");
//                                name = scanner.nextLine();
//                                if (!ValidateUtils.isName(name)) {
//                                    System.out.println("Name invalid, please re-enter");
//                                }
//                            } while (!ValidateUtils.isName(name));
//
//                            boolean validDateOfBirth = false;
//                            Date dateOfBirth;
//
//                            do {
//                                String dateOfBirthStr;
//                                System.out.println("Enter date of birth");
//                                dateOfBirthStr = scanner.nextLine();
//                                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//                                dateOfBirth = dateFormat.parse(dateOfBirthStr);
//                                if (!ValidateUtils.is18YearsOld(dateOfBirth)) {
//                                    System.out.println("Not enough 18 years old, please re-enter");
//                                } else validDateOfBirth = true;
//                            } while (!validDateOfBirth);
//
//
//
//                            System.out.println("Enter gender of employee");
//                            String gender = scanner.nextLine();
//
//                            String idNumber;
//                            do {
//                                System.out.println("Enter IdNumber of employee");
//                                idNumber = scanner.nextLine();
//                                if (!ValidateUtils.isIdNumber(idNumber)) {
//                                    System.out.println("idNumber invalid, please re-enter");
//                                }
//
//                            } while (!ValidateUtils.isIdNumber(idNumber));
//
//                            String phoneNumber;
//                            do {
//                                System.out.println("Enter phone number of employee");
//                                phoneNumber = scanner.nextLine();
//                                if(!ValidateUtils.isPhoneNumber(phoneNumber)){
//                                    System.out.println("invalid phone number, please re-enter");
//                                }
//                            } while (!ValidateUtils.isPhoneNumber(phoneNumber));
//
//
//                            System.out.println("Enter email of employee");
//                            String email = scanner.nextLine();
//                            System.out.println("Enter Education level of employee");
//                            String educationLevel = scanner.nextLine();
//                            System.out.println("Enter position of employee");
//                            String position = scanner.nextLine();
//
//                            double salary;
//                            do {
//                                System.out.println("Enter salary of employee");
//                                salary = Double.parseDouble(scanner.nextLine());
//                                if(!ValidateUtils.isValidSalary(salary)){
//                                    System.out.println("Salary must be greater than 0. Please re-enter.");
//                                }
//                            } while (!ValidateUtils.isValidSalary(salary));
//
//                            Employee employee = new Employee(name, dateOfBirth, gender, idNumber, phoneNumber, email, idEmployee, educationLevel, position, salary);
//                            employeeService.add(employee);
//                        } catch (ParseException e) {
//                            System.out.println("Lỗi định dạng ngày tháng năm");
//                        } catch (NumberFormatException e) {
//                            System.out.println("Số không hợp lệ vui lòng nhập số");
//                        } catch (Exception e) {
//                            System.out.println("Đã xảy ra lỗi " + e.getMessage());
//                        }
//                        break;
//                    case 3:
//                        try {
//                            System.out.println("This is edit Infomation Employee function");
//                            System.out.println("Please enter id employee to edit");
//                            String idEmployeeEdit = scanner.nextLine();
//                            Employee employeeEdit = employeeService.findById(idEmployeeEdit);
//                            if(employeeEdit!=null){
//                                String name;
//                                do {
//                                    System.out.println("Re-enter the employee name you want to edit");
//                                    name = scanner.nextLine();
//                                    if (!ValidateUtils.isName(name)) {
//                                        System.out.println("Name invalid, please re-enter");
//                                    }
//                                } while (!ValidateUtils.isName(name));
//
//                                boolean validDateOfBirth = false;
//                                Date dateOfBirth;
//
//                                do {
//                                    String dateOfBirthStr;
//                                    System.out.println("Re-enter date of birth of employee you want to edit");
//                                    dateOfBirthStr = scanner.nextLine();
//                                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//                                    dateOfBirth = dateFormat.parse(dateOfBirthStr);
//                                    if (!ValidateUtils.is18YearsOld(dateOfBirth)) {
//                                        System.out.println("Not enough 18 years old, please re-enter");
//                                    } else validDateOfBirth = true;
//                                } while (!validDateOfBirth);
//
//
//
//                                System.out.println("Re-enter the employee gender you want to edit");
//                                String gender = scanner.nextLine();
//
//                                String idNumber;
//                                do {
//                                    System.out.println("Re-enter the employee IDnumber you want to edit");
//                                    idNumber = scanner.nextLine();
//                                    if (!ValidateUtils.isIdNumber(idNumber)) {
//                                        System.out.println("idNumber invalid, please re-enter");
//                                    }
//
//                                } while (!ValidateUtils.isIdNumber(idNumber));
//
//                                String phoneNumber;
//                                do {
//                                    System.out.println("Re-enter the employee phone number you want to edit");
//                                    phoneNumber = scanner.nextLine();
//                                    if(!ValidateUtils.isPhoneNumber(phoneNumber)){
//                                        System.out.println("invalid phone number, please re-enter");
//                                    }
//                                } while (!ValidateUtils.isPhoneNumber(phoneNumber));
//
//
//                                System.out.println("Re-enter the employee email you want to edit");
//                                String email = scanner.nextLine();
//                                System.out.println("Enter Education level of employee");
//                                String educationLevel = scanner.nextLine();
//                                System.out.println("Enter position of employee");
//                                String position = scanner.nextLine();
//
//                                double salary;
//                                do {
//                                    System.out.println("Re-enter the employee salary you want to edit");
//                                    salary = Double.parseDouble(scanner.nextLine());
//                                    if(!ValidateUtils.isValidSalary(salary)){
//                                        System.out.println("Salary must be greater than 0. Please re-enter.");
//                                    }
//                                } while (!ValidateUtils.isValidSalary(salary));
//
//                                employeeEdit = new Employee(name, dateOfBirth, gender, idNumber, phoneNumber, email, idEmployeeEdit, educationLevel, position, salary);
//                                employeeService.updateFile(employeeEdit);
//                            } else {
//                                System.out.println("ID Employee not found");
//                            }
//                        } catch (ParseException e) {
//                            System.out.println("Error format date");
//                        } catch (NumberFormatException e) {
//                            System.out.println("Please re-enter num valid");
//                        } catch (Exception e) {
//                            System.out.println("Error " + e.getMessage());
//                        }
//                        break;
//                    case 4:
//                        System.out.println("This is Booking Management function");
//                        return;
//                    default:
//                        System.out.println("Invalid number. Please choice number 1-4");
//                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter number");
            }
        }
        while (true);
    }
}
