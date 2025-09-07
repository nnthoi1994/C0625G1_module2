package case_study.quan_ly_sv.service;

import case_study.quan_ly_sv.entity.SinhVien;

import java.util.List;

public interface ISinhVienService {
    List<SinhVien> findAll();
    SinhVien findById(String id);
    boolean add(SinhVien sinhVien);
    boolean delete(String id);
    List<SinhVien> search(String ten);

}
