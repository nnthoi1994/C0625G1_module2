package ss8_clean_code.repository;

import ss8_clean_code.entity.Car;
import ss8_clean_code.util.ReadWrite;

import java.io.IOException;
import java.util.*;
import java.util.List;

public class CarRepository implements ICarRepository {
    private final String pathFile = "src/ss8_clean_code/data/car.csv";

    @Override
    public List<Car> findAll() {
        List<Car> carList = new ArrayList<>();
        try {
            List<String> stringList = ReadWrite.readFileCSV(pathFile);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
                Car car = new Car(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]), array[5]);
                carList.add(car);
            }

        } catch (IOException e) {
            System.out.println("Loi doc file");
            ;
        }


        return carList;
    }

    @Override
    public boolean add(Car car) {
        List<String> stringList = new ArrayList<>();
        stringList.add(car.getInfoToCsv());
        try {
            ReadWrite.writeFileCSV(pathFile, stringList, true);
        } catch (IOException e) {
            System.out.println("Loi ghi file");
            return false;
        }
        return true;
    }

    @Override
    public boolean edit(Car car) {
        List<Car> carList = new ArrayList<>();
        try {
            List<String> stringList = ReadWrite.readFileCSV(pathFile);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
                Car carRead = new Car(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]), array[5]);
                carList.add(carRead);
            }

        } catch (IOException e) {
            System.out.println("Loi doc file");
            ;
        }
        for (int i = 0; i < carList.size(); i++) {
            if (Objects.equals(carList.get(i).getControlNumber(), car.getControlNumber())) {
                carList.set(i, car);
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Car carWrite : carList) {
            stringList.add(carWrite.getInfoToCsv());
        }
        try {
            ReadWrite.writeFileCSV(pathFile, stringList, false);
        } catch (IOException e) {
            System.out.println("Loi ghi file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String numberControl) {
        List<Car> carList = findAll();

        for (int i = 0; i < carList.size(); i++) {
            if (Objects.equals(carList.get(i).getControlNumber(), numberControl)) {
                carList.remove(i);
break;
            }
        }

        List<String> stringList = new ArrayList<>();
        for (Car carWrite : carList) {
            stringList.add(carWrite.getInfoToCsv());
        }
        try {
            ReadWrite.writeFileCSV(pathFile, stringList, false);
        } catch (IOException e) {
            System.out.println("Loi ghi file");
            return false;
        }

        return true;
    }

    @Override
    public Car findByNumberControl(String numberControl) {
        List<Car> carList = new ArrayList<>();
        try {
            List<String> stringList = ReadWrite.readFileCSV(pathFile);
            String[] array = null;
            for (String line : stringList) {
                array = line.split(",");
                Car car = new Car(array[0], array[1], Integer.parseInt(array[2]), array[3], Integer.parseInt(array[4]), array[5]);
                carList.add(car);
            }

        } catch (IOException e) {
            System.out.println("Loi doc file");
            ;
        }
        for (int i = 0; i < carList.size(); i++) {
            if (Objects.equals(carList.get(i).getControlNumber(), numberControl)) {
                return carList.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Car> search(String numberControl) {
        List<Car> carList = findAll();
        List<Car> searchList = new ArrayList<>();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getControlNumber().contains(numberControl)) {
                searchList.add(carList.get(i));
            }
        }
        return searchList;
    }


}
