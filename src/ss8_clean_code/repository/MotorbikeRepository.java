package ss8_clean_code.repository;

import ss8_clean_code.entity.Car;
import ss8_clean_code.entity.Motorbike;

import java.util.ArrayList;
import java.util.Scanner;


public class MotorbikeRepository implements IMotorbikeRepository{
    static Scanner sc = new Scanner(System.in);
    private static final ArrayList<Motorbike> motorBikeList = new ArrayList<>();

    static {
        motorBikeList.add(new Motorbike("43C-11231", "Honda", 2019, "Nguyen Van A", 125));
        motorBikeList.add(new Motorbike("75C-14444", "Hyundai", 2019, "Nguyen Van B", 125));
    }

    @Override
    public ArrayList<Motorbike> findAll() {
        return motorBikeList;
    }

    @Override
    public boolean add(Motorbike motorbike) {
        motorBikeList.add(motorbike);
        return true;
    }

    @Override
    public boolean update() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public Car find() {
        return null;
    }
}
