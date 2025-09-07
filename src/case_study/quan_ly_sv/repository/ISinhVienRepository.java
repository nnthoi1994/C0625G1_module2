package case_study.quan_ly_sv.repository;

import case_study.quan_ly_sv.entity.SinhVien;
import ss8_clean_code.entity.Car;

import java.util.List;

public interface ISinhVienRepository {
    List<SinhVien> findAll();
    boolean add(SinhVien sinhVien);
    boolean delete(String id);
    SinhVien findByTen(String ten);
    List<SinhVien> search(String ten);
}
