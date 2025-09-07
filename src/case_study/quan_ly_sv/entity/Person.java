package case_study.quan_ly_sv.entity;

import java.time.LocalDate;


public abstract class Person {
    private String id;
    private String ten;
    private LocalDate ngaySinh;
    private String gioiTinh;
    private String soDienThoai;

    public Person() {
    }

    public Person(String id, String ten, LocalDate ngaySinh, String gioiTinh, String soDienThoai) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String name) {
        this.ten = ten;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "Mã='" + id + '\'' +
                ", Tên='" + ten + '\'' +
                ", Ngày sinh=" + ngaySinh +
                ", Giới tính='" + gioiTinh + '\'' +
                ", Số điện thoại='" + soDienThoai + '\'' +
                '}';
    }
}
