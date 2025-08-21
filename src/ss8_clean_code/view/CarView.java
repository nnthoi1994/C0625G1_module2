package ss8_clean_code.view;

import ss8_clean_code.entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarView {
    public static Scanner sc = new Scanner(System.in);
    public static void display(List<Car> cars){
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
    public static Car inputForCarData(){
        System.out.println("Enter Control number");
        String numberControl = sc.nextLine();
        System.out.println("Enter name of manufacture");
        String nameManufacture = sc.nextLine();
        System.out.println("Enter year of manufacture");
        int yearManufacture = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name of owner");
        String nameOwner = sc.nextLine();
        System.out.println("Enter num of seat");
        int numSeat = Integer.parseInt(sc.nextLine());
        System.out.println("Enter type of car");
        String typeCar = sc.nextLine();
        return new Car(numberControl,nameManufacture, yearManufacture, nameOwner,numSeat,typeCar);
    }
    public static  Car editData(String numberControl){
        System.out.println("Enter name of manufacture");
        String nameManufacture = sc.nextLine();
        System.out.println("Enter year of manufacture");
        int yearManufacture = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name of owner");
        String nameOwner = sc.nextLine();
        System.out.println("Enter num of seat");
        int numSeat = Integer.parseInt(sc.nextLine());
        System.out.println("Enter type of car");
        String typeCar = sc.nextLine();
        return new Car(numberControl,nameManufacture, yearManufacture, nameOwner,numSeat,typeCar);
    }

}
