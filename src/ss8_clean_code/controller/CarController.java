package ss8_clean_code.controller;

import ss8_clean_code.entity.Car;
import ss8_clean_code.service.CarService;
import ss8_clean_code.service.ICarService;
import ss8_clean_code.view.CarView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarController {
    private ICarService carService = new CarService();

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        final int EDIT = 5;
        boolean flag = true;
        while (flag) {
            System.out.println("Manage Car");
            System.out.println("-------Function------" +
                    "\n 1. List cars" +
                    "\n 2. Add car" +
                    "\n 3. Delete car" +
                    "\n 4. Search car" +
                    "\n 5. Edit car" +
                    "\n 6. Back Menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY:
                    System.out.println("Display list cars");
                    ArrayList<Car> carList = this.carService.findAll();
                    CarView.display(carList);
                    break;
                case ADD:
                    System.out.println("This is add function");
                    Car car = CarView.inputForCarData();
                    this.carService.add(car);
                    System.out.println("Add car succeed");
                    break;
                case DELETE:
                    System.out.println("This is delete function \n Please enter number control of car");
                    String numberControl = scanner.nextLine();

                    if (this.carService.delete(numberControl)) {
                        System.out.println("Delete succeed");
                    } else {
                        System.out.println("not found to delete");
                    }

                    break;
                case SEARCH:
                    System.out.println("This is search function \n Please enter number control of car");
                    String numberControl2 = scanner.nextLine();
                    this.carService.search(numberControl2);
                    ArrayList<Car> searchList = this.carService.search(numberControl2);
                    if (!searchList.isEmpty()) {
                        CarView.display(searchList);
                    } else {
                        System.out.println("Not found");
                    }
                    break;
                case EDIT:
                    System.out.println("This is edit function \n Please enter number control of car");
                    String numberControlEdit = scanner.nextLine();
                    Car editCar = this.carService.findByNumberControl(numberControlEdit);
                    if (editCar != null) {
                        System.out.println(editCar);
                        System.out.println("Enter info of car to edit!");
                        editCar = CarView.editData(numberControlEdit);
                        this.carService.edit(editCar);
                    } else {
                        System.out.println("Not found Car to edit");
                    }


            }
        }
    }
}
