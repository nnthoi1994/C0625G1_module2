package case_study.furama_resort.controller;

import case_study.furama_resort.model.Customer;
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
            System.out.println("\n--Customer Management MENU--");
            System.out.println("1.Display list customer");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer");
            System.out.println("4.Return main menu");
            System.out.println("Plese enter your choice");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        customerService.display();
                        break;
                    case 2:
                        try {
                            System.out.println("This is Add Customer function");
                            String idCustomer;
                            do {
                                System.out.println("Enter idCustomer (Format KH-YYYY): ");
                                idCustomer = scanner.nextLine();
                                if (!ValidateUtils.isIdCustomer(idCustomer)) {
                                    System.out.println("IdCustomer invalid, please re-enter");
                                }
                            }
                            while (!ValidateUtils.isIdCustomer(idCustomer));

                            String name;
                            do {
                                System.out.println("Enter name of Customer");
                                name = scanner.nextLine();
                                if (!ValidateUtils.isName(name)) {
                                    System.out.println("Name invalid, please re-enter");
                                }
                            } while (!ValidateUtils.isName(name));

                            boolean validDateOfBirth = false;
                            Date dateOfBirth;

                            do {
                                String dateOfBirthStr;
                                System.out.println("Enter date of birth");
                                dateOfBirthStr = scanner.nextLine();
                                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                                dateOfBirth = dateFormat.parse(dateOfBirthStr);
                                if (!ValidateUtils.is18YearsOld(dateOfBirth)) {
                                    System.out.println("Not enough 18 years old, please re-enter");
                                } else validDateOfBirth = true;
                            } while (!validDateOfBirth);



                            System.out.println("Enter gender of Customer");
                            String gender = scanner.nextLine();

                            String idNumber;
                            do {
                                System.out.println("Enter IdNumber of Customer");
                                idNumber = scanner.nextLine();
                                if (!ValidateUtils.isIdNumber(idNumber)) {
                                    System.out.println("idNumber invalid, please re-enter");
                                }

                            } while (!ValidateUtils.isIdNumber(idNumber));

                            String phoneNumber;
                            do {
                                System.out.println("Enter phone number of Customer");
                                phoneNumber = scanner.nextLine();
                                if(!ValidateUtils.isPhoneNumber(phoneNumber)){
                                    System.out.println("invalid phone number, please re-enter");
                                }
                            } while (!ValidateUtils.isPhoneNumber(phoneNumber));


                            System.out.println("Enter email of Customer");
                            String email = scanner.nextLine();
                            System.out.println("Enter typeCustomer of Customer");
                            String typeCustomer = scanner.nextLine();
                            System.out.println("Enter adress of Customer");
                            String adress = scanner.nextLine();



                            Customer customer = new Customer(name, dateOfBirth, gender, idNumber, phoneNumber, email, idCustomer, typeCustomer, adress);
                            customerService.add(customer);
                        } catch (ParseException e) {
                            System.out.println("Error format date");
                        } catch (NumberFormatException e) {
                            System.out.println("Number invalid");
                        } catch (Exception e) {
                            System.out.println("Error " + e.getMessage());
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("This is edit Infomation Customer function");
                            System.out.println("Please enter id Customer to edit");
                            String idCustomerEdit = scanner.nextLine();
                            Customer customerEdit = customerService.findById(idCustomerEdit);
                            if(customerEdit!=null){
                                String name;
                                do {
                                    System.out.println("Re-enter the Customer name you want to edit");
                                    name = scanner.nextLine();
                                    if (!ValidateUtils.isName(name)) {
                                        System.out.println("Name invalid, please re-enter");
                                    }
                                } while (!ValidateUtils.isName(name));

                                boolean validDateOfBirth = false;
                                Date dateOfBirth;

                                do {
                                    String dateOfBirthStr;
                                    System.out.println("Re-enter date of birth of Customer you want to edit");
                                    dateOfBirthStr = scanner.nextLine();
                                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                                    dateOfBirth = dateFormat.parse(dateOfBirthStr);
                                    if (!ValidateUtils.is18YearsOld(dateOfBirth)) {
                                        System.out.println("Not enough 18 years old, please re-enter");
                                    } else validDateOfBirth = true;
                                } while (!validDateOfBirth);



                                System.out.println("Re-enter the Customer gender you want to edit");
                                String gender = scanner.nextLine();

                                String idNumber;
                                do {
                                    System.out.println("Re-enter the Customer IDnumber you want to edit");
                                    idNumber = scanner.nextLine();
                                    if (!ValidateUtils.isIdNumber(idNumber)) {
                                        System.out.println("idNumber invalid, please re-enter");
                                    }

                                } while (!ValidateUtils.isIdNumber(idNumber));

                                String phoneNumber;
                                do {
                                    System.out.println("Re-enter the Customer phone number you want to edit");
                                    phoneNumber = scanner.nextLine();
                                    if(!ValidateUtils.isPhoneNumber(phoneNumber)){
                                        System.out.println("invalid phone number, please re-enter");
                                    }
                                } while (!ValidateUtils.isPhoneNumber(phoneNumber));


                                System.out.println("Re-enter the Customer email you want to edit");
                                String email = scanner.nextLine();
                                System.out.println("Enter typeCustomer level of Customer");
                                String typeCustomer = scanner.nextLine();
                                System.out.println("Enter adress of Customer");
                                String adress = scanner.nextLine();



                                customerEdit = new Customer(name, dateOfBirth, gender, idNumber, phoneNumber, email, idCustomerEdit, typeCustomer, adress);
                                customerService.updateFile(customerEdit);
                            } else {
                                System.out.println("ID Customer not found");
                            }
                        } catch (ParseException e) {
                            System.out.println("Error format date");
                        } catch (NumberFormatException e) {
                            System.out.println("Please re-enter num valid");
                        } catch (Exception e) {
                            System.out.println("Error " + e.getMessage());
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
