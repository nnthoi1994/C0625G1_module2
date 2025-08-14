package ss8_clean_code.repository;

import ss8_clean_code.entity.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class OtoRepository {
    static Scanner sc = new Scanner(System.in);
            private static final ArrayList<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("43C-11231", "Honda", 2019, "Nguyen Van A", 12, "Passenger bus"));
        carList.add(new Car("75C-14444", "Hyundai", 2019, "Nguyen Van B", 12, "Tour bus"));
        carList.add(new Car("74C-13333", "Ika", 2019, "Nguyen Van C", 12, "Tour bus"));
        carList.add(new Car("92C-18787", "Mecsides", 2019, "Nguyen Van D", 12, "Passenger bus"));
    }
}
