package case_study.quan_ly_sv.entity;

import java.time.LocalDate;


public class SinhVien extends Person{
    private String maLopHoc;

    public SinhVien(String maLopHoc) {
    }

    public SinhVien(String id, String ten, LocalDate ngaySinh, String gioiTinh, String soDienThoai, String maLopHoc) {
        super(id, ten, ngaySinh, gioiTinh, soDienThoai);
        this.maLopHoc = maLopHoc;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    @Override
    public String toString() {
        return super.toString()  + '\'' + "Mã lớp học= " + maLopHoc ;
    }

    public String getInfoToCsv(){
        return this.getId() + "," + this.getTen() + "," + this.getNgaySinh() + "," + this.getGioiTinh() + "," + this.getSoDienThoai() + "," + this.getMaLopHoc() ;
    }
}
