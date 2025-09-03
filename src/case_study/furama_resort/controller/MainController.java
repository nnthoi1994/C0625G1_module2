package case_study.furama_resort.controller;
import case_study.furama_resort.service.EmployeeService;
import case_study.furama_resort.service.IEmployeeService;
import java.util.Scanner;
public class MainController {
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("\n--FURAMA RESORT MANAGEMENT MENU--");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit");
            System.out.println("Plese enter your choice");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        EmployeeController.displayEmployMenu();
                        break;
                    case 2:
//                        displayCustomerMenu();
                        break;
                    case 3:
//                        displayFacilityMenu();
                        break;
                    case 4:
//                        displayBookingMenu();
                        break;
                    case 5:
//                        displayPromotionMenu();
                        break;
                    case 6:
                        System.out.println("Exit program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid number. Please choice number 1-6");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter number");
            }

        }
        while (true);
    }
}