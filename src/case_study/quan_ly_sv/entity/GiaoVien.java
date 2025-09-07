package case_study.quan_ly_sv.entity;

import java.time.LocalDate;

public class GiaoVien extends Person{
    public GiaoVien() {
    }

    public GiaoVien(String id, String ten, LocalDate ngaySinh, String gioiTinh, String soDienThoai) {
        super(id, ten, ngaySinh, gioiTinh, soDienThoai);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public String getInfoToCsv(){
        return this.getId() + "," + this.getTen() + "," + this.getNgaySinh() + "," + this.getGioiTinh() + "," + this.getSoDienThoai();
    }
}
