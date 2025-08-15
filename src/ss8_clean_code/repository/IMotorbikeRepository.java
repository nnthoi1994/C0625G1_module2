package ss8_clean_code.repository;

import ss8_clean_code.entity.Car;
import ss8_clean_code.entity.Motorbike;

import java.util.ArrayList;

public interface IMotorbikeRepository {
    ArrayList<Motorbike> findAll();
    boolean add(Motorbike motorbike);
    boolean update();
    boolean delete();
    Car find();
}
