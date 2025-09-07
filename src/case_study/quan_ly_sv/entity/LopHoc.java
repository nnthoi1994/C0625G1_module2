package case_study.quan_ly_sv.entity;

public class LopHoc {
    private String idLopHoc;
    private String tenLop;
    private String idGiaoVien;

    public LopHoc() {
    }

    public LopHoc(String idLopHoc, String tenLop, String idGiaoVien) {
        this.idLopHoc = idLopHoc;
        this.tenLop = tenLop;
        this.idGiaoVien = idGiaoVien;
    }

    public String getIdLopHoc() {
        return idLopHoc;
    }

    public void setIdLopHoc(String idLopHoc) {
        this.idLopHoc = idLopHoc;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getIdGiaoVien() {
        return idGiaoVien;
    }

    public void setIdGiaoVien(String idGiaoVien) {
        this.idGiaoVien = idGiaoVien;
    }
    @Override
    public String toString() {
        return "Mã lớp học:'" + idLopHoc + '\'' +
                ", Tên lớp học: '" + tenLop + '\'' +
                ", Mã giáo viên'" + idGiaoVien;
    }
    public String getInfoToCsv(){
        return this.getIdLopHoc() + "," + this.getTenLop() + "," + this.getIdGiaoVien();
    }
}
