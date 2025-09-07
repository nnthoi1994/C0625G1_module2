package case_study.quan_ly_sv.service;

import case_study.quan_ly_sv.entity.SinhVien;
import ss8_clean_code.entity.Car;

import java.util.List;

public class SinhVienService implements ISinhVienService{
    SinhVienService sinhVienRepository = new SinhVienService();
    @Override
    public List<SinhVien> findAll() {
        return sinhVienRepository.findAll();
    }

    @Override
    public Car findById(String id) {
        return sinhVienRepository.findById(id);
    }

    @Override
    public boolean add(SinhVien sinhVien) {
        return sinhVienRepository.add(sinhVien);
    }

    @Override
    public boolean delete(String id) {
        return sinhVienRepository.delete(id);
    }

    @Override
    public List<SinhVien> search(String ten) {
        return sinhVienRepository.search(ten);
    }
}
