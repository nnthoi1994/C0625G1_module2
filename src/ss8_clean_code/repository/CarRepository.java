package ss8_clean_code.repository;

import ss8_clean_code.entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CarRepository implements ICarRepository{
    static Scanner sc = new Scanner(System.in);
            private static final ArrayList<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("43C-11231", "Honda", 2019, "Nguyen Van A", 12, "Passenger bus"));
        carList.add(new Car("75C-14444", "Hyundai", 2019, "Nguyen Van B", 12, "Tour bus"));
        carList.add(new Car("74C-13333", "Ika", 2019, "Nguyen Van C", 12, "Tour bus"));
        carList.add(new Car("92C-18787", "Mecsides", 2019, "Nguyen Van D", 12, "Passenger bus"));
    }

    @Override
    public ArrayList<Car> findAll() {
        return carList;
    }

    @Override
    public boolean add(Car car) {
        return carList.add(car);
    }

    @Override
    public boolean edit( Car car) {
        for (int i = 0; i < carList.size(); i++) {
            if(Objects.equals(carList.get(i).getControlNumber(), car.getControlNumber())){
                carList.set(i, car );
            }
        }
        return true;
    }

    @Override
    public boolean delete(String numberControl) {
        for (int i = 0; i < carList.size(); i++) {
            if (Objects.equals(carList.get(i).getControlNumber(), numberControl)) {
                carList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Car findByNumberControl(String numberControl) {
        for (int i = 0; i < carList.size(); i++) {
            if(Objects.equals(carList.get(i).getControlNumber(), numberControl)){
                return carList.get(i);
            }
        }
        return null;
    }

    @Override
    public ArrayList<Car> search(String numberControl){
        ArrayList<Car> searchList = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {
            if(carList.get(i).getControlNumber().contains(numberControl)){
                searchList.add(carList.get(i));
            }
        }
        return searchList;
    }




}
