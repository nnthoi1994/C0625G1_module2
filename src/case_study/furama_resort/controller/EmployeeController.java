package case_study.furama_resort.controller;

import case_study.furama_resort.model.Employee;
import case_study.furama_resort.service.EmployeeService;
import case_study.furama_resort.service.IEmployeeService;
import case_study.furama_resort.utils.InputException;
import case_study.furama_resort.utils.ValidateUtils;

import java.net.FileNameMap;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeController {
    private static final IEmployeeService employeeService = new EmployeeService();
    public static void displayEmployMenu() {

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
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        employeeService.display();
                        break;
                    case 2:
                        System.out.println("This is Add Employee function");

                        String idEmployee;
                        while (true) {
                            try {
                                System.out.println("Enter idEmployee (Format NV-YYYY): ");
                                idEmployee = scanner.nextLine();
                                ValidateUtils.isIdEmployee(idEmployee);
                                break;
                            } catch (Exception e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        }

                        String name;
                        while (true) {
                            try {
                                System.out.println("Enter name of employee");
                                name = scanner.nextLine();
                                ValidateUtils.isName(name);
                                    break;
                                }
                             catch (Exception e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        }

                        Date dateOfBirth = null;
                 while (true) {
                     try {
                         System.out.println("Enter date of birth (dd/MM/yyyy): ");
                         String dateOfBirthStr = scanner.nextLine();
                         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                         dateOfBirth = dateFormat.parse(dateOfBirthStr);

                         ValidateUtils.is18YearsOld(dateOfBirth);
                         break;
                     } catch (InputException e) {
                         System.out.println("Tuoi phai co 18 tu tuoi, vui long nhap lai tuoi");
                     }
                     catch (ParseException e) {
                         System.out.println("Error: " + e.getMessage());
                     }
                 }


                        System.out.println("Enter gender of employee");
                        String gender = scanner.nextLine();

                        String idNumber;
                        do {
                            try {
                                System.out.println("Enter IdNumber of employee");
                                idNumber = scanner.nextLine();
                                if (!ValidateUtils.isIdNumber(idNumber)) {
                                    System.out.println("idNumber invalid, please re-enter");
                                } else {
                                    break;
                                }
                            } catch (Exception e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        } while (true);

                        String phoneNumber;
                        do {
                            try {
                                System.out.println("Enter phone number of employee");
                                phoneNumber = scanner.nextLine();
                                if(!ValidateUtils.isPhoneNumber(phoneNumber)){
                                    System.out.println("Invalid phone number, please re-enter");
                                } else {
                                    break;
                                }
                            } catch (Exception e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        } while (true);

                        System.out.println("Enter email of employee");
                        String email = scanner.nextLine();
                        System.out.println("Enter Education level of employee");
                        String educationLevel = scanner.nextLine();
                        System.out.println("Enter position of employee");
                        String position = scanner.nextLine();

                        double salary = 0;
                        do {
                            try {
                                System.out.println("Enter salary of employee");
                                salary = Double.parseDouble(scanner.nextLine());
                                if(!ValidateUtils.isValidSalary(salary)){
                                    System.out.println("Salary must be greater than 0. Please re-enter.");
                                } else {
                                    break;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Số không hợp lệ, vui lòng nhập số");
                            }
                        } while (true);

                        Employee employee = new Employee(name, dateOfBirth, gender, idNumber, phoneNumber, email, idEmployee, educationLevel, position, salary);
                        employeeService.add(employee);

                        break;

                    case 3:
                            System.out.println("This is edit Infomation Employee function");
                            System.out.println("Please enter id employee to edit");
                            String idEmployeeEdit = scanner.nextLine();
                            Employee employeeEdit = employeeService.findById(idEmployeeEdit);
                            if(employeeEdit!=null){
                                String nameEdit;
                                while (true) {
                                    try{
                                    System.out.println("Re-enter the employee name you want to edit");
                                    nameEdit = scanner.nextLine();
                                    ValidateUtils.isName(nameEdit);
                                    break;
                                    } catch (InputException e){
                                        System.out.println(e.getMessage());
                                    }
                                }

                                Date dateOfBirthEdit;

                                while (true) {
                                    try {
                                        String dateOfBirthStr;
                                        System.out.println("Re-enter date of birth of employee you want to edit");
                                        dateOfBirthStr = scanner.nextLine();
                                        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                                        dateOfBirthEdit = dateFormat.parse(dateOfBirthStr);
                                        ValidateUtils.is18YearsOld(dateOfBirthEdit);
                                        break;
                                    } catch (InputException|ParseException e){
                                        System.out.println(e.getMessage());
                                    }
                                }



                                System.out.println("Re-enter the employee gender you want to edit");
                                String genderEdit = scanner.nextLine();

                                String idNumberEdit;
                                do {
                                    System.out.println("Re-enter the employee IDnumber you want to edit");
                                    idNumberEdit = scanner.nextLine();
                                    if (!ValidateUtils.isIdNumber(idNumberEdit)) {
                                        System.out.println("idNumber invalid, please re-enter");
                                    }

                                } while (!ValidateUtils.isIdNumber(idNumberEdit));

                                String phoneNumberEdit;
                                do {
                                    System.out.println("Re-enter the employee phone number you want to edit");
                                    phoneNumberEdit = scanner.nextLine();
                                    if(!ValidateUtils.isPhoneNumber(phoneNumberEdit)){
                                        System.out.println("invalid phone number, please re-enter");
                                    }
                                } while (!ValidateUtils.isPhoneNumber(phoneNumberEdit));


                                System.out.println("Re-enter the employee email you want to edit");
                                String emailEdit = scanner.nextLine();
                                System.out.println("Enter Education level of employee");
                                String educationLevelEdit = scanner.nextLine();
                                System.out.println("Enter position of employee");
                                String positionEdit = scanner.nextLine();

                                double salaryEdit;
                                do {
                                    System.out.println("Re-enter the employee salary you want to edit");
                                    salaryEdit = Double.parseDouble(scanner.nextLine());
                                    if(!ValidateUtils.isValidSalary(salaryEdit)){
                                        System.out.println("Salary must be greater than 0. Please re-enter.");
                                    }
                                } while (!ValidateUtils.isValidSalary(salaryEdit));

                                employeeEdit = new Employee(nameEdit, dateOfBirthEdit, genderEdit, idNumberEdit, phoneNumberEdit, emailEdit, idEmployeeEdit, educationLevelEdit, positionEdit, salaryEdit);
                                employeeService.updateFile(employeeEdit);
                            } else {
                                System.out.println("ID Employee not found");
                            }

                        break;
                    case 4:
                        System.out.println("This is Booking Management function");
                        return;
                    default:
                        System.out.println("Invalid number. Please choice number 1-4");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter number");
            }
        }
        while (true);
    }
}
