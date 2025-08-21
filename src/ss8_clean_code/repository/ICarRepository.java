package ss8_clean_code.repository;

import ss8_clean_code.entity.Car;

import java.util.ArrayList;
import java.util.List;

public interface    ICarRepository {
    List<Car> findAll();
    boolean add(Car car);
    boolean edit(Car car);
    boolean delete(String numberControl);
    Car findByNumberControl(String numberControl);
    List<Car> search(String numberControl);

}
