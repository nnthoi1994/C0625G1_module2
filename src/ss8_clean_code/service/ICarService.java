package ss8_clean_code.service;

import ss8_clean_code.entity.Car;

import java.util.ArrayList;
import java.util.List;

public interface ICarService {
    ArrayList<Car> findAll();
    Car findByNumberControl(String numberControl);
    boolean add(Car car);
    boolean delete(String numberControlCar);
    ArrayList<Car> search(String numControlCar);
    boolean edit(Car car);

}
