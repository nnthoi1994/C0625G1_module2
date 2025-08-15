package ss8_clean_code.service;

import ss8_clean_code.entity.Car;
import ss8_clean_code.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

public class CarService implements ICarService{
    CarRepository carRepository = new CarRepository();

    @Override
    public ArrayList<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car findByNumberControl(String numberControl) {
        return carRepository.findByNumberControl(numberControl);
    }

    @Override
    public boolean add(Car car) {
        return carRepository.add(car);
    }

    @Override
    public boolean delete(String numberControlCar) {
        return carRepository.delete(numberControlCar);
    }

    @Override
    public ArrayList<Car> search(String numControlCar) {
        return carRepository.search(numControlCar);
    }

    @Override
    public boolean edit(Car car) {
        return carRepository.edit(car);
    }

}
