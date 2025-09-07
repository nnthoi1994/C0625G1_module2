package case_study.quan_ly_sv.repository;

import case_study.quan_ly_sv.entity.SinhVien;
import ss8_clean_code.entity.Car;
import ss8_clean_code.util.ReadWrite;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SinhVienRepository implements ISinhVienRepository{
    private final String pathFile = "src/case_study/quan_ly_sv/data/sinhVien.csv";

    @Override
    public List<SinhVien> findAll() {
        List<SinhVien> sinhVienList = new ArrayList<>();
        try {
            List<String> stringList = ReadWrite.readFileCSV(pathFile);
            for (String line : stringList) {
                String[] array = line.split(",");
                SinhVien sinhVien = new SinhVien(array[0], array[1], LocalDate.parse(array[2]), array[3], array[4], array[5]);
                sinhVienList.add(sinhVien);
            }
        } catch (IOException e) {
            System.out.println("Loi doc file");
            ;
        }
        return sinhVienList;
    }

    @Override
    public boolean add(SinhVien sinhVien) {
        List<String> stringList = new ArrayList<>();
        stringList.add(sinhVien.getInfoToCsv());
        try {
            ReadWrite.writeFileCSV(pathFile, stringList, true);
        } catch (IOException e) {
            System.out.println("Loi ghi file");
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String id) {
        List<SinhVien> sinhVienList = findAll();

        for (int i = 0; i < sinhVienList.size(); i++) {
            if (Objects.equals(sinhVienList.get(i).getId(), id)) {
                sinhVienList.remove(i);
                break;
            }
        }

        List<String> stringList = new ArrayList<>();
        for (SinhVien sinhVienWrite : sinhVienList) {
            stringList.add(sinhVienWrite.getInfoToCsv());
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
    public SinhVien findById(String id) {
        List<SinhVien> sinhVienList = findAll();
        for (int i = 0; i < sinhVienList.size(); i++) {
            if (Objects.equals(sinhVienList.get(i).getId(), id)) {
                return sinhVienList.get(i);
            }
        }
        return null;
    }

    @Override
    public List<SinhVien> search(String ten) {
        List<SinhVien> sinhVienList = findAll();
        List<SinhVien> searchList = new ArrayList<>();
        for (int i = 0; i < sinhVienList.size(); i++) {
            if (sinhVienList.get(i).getTen().contains(ten)) {
                searchList.add(sinhVienList.get(i));
            }
        }
        return searchList;
    }
}
