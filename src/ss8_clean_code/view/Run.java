package ss8_clean_code.view;

import ss8_clean_code.controller.CarController;


public class Run {
    public static void main(String[] args) {
        displayMain();
    }
    public static void displayMain(){
        CarController carController = new CarController();
        carController.displayMenu();
    }
}
