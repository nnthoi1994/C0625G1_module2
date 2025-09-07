package case_study.quan_ly_sv.view;

import case_study.quan_ly_sv.entity.SinhVien;
import case_study.quan_ly_sv.utils.InputException;
import case_study.quan_ly_sv.utils.ValidateUtils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class SinhVienView {
    private static Scanner scanner = new Scanner(System.in);
    public static void display(List<SinhVien> sinhVienList){
        for (SinhVien sinhVien: sinhVienList) {
            System.out.println(sinhVien);
        }
    }
    public static SinhVien nhapSinhVien(){
        String idSV;
        String idLopHoc;
        String hoTen;
        LocalDate ngaySinh = null;
        String soDienThoai;


        while (true) {
            try {
                System.out.println("Nhập Mã sinh viên (SV-YYYY), Y từ 0-9: ");
                idSV = scanner.nextLine();
                ValidateUtils.validateIdSinhVien(idSV);
                break;
            } catch (InputException e) {
                System.err.println("Lỗi: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Nhập Mã lớp học (LOP-YYYY), Y từ 0-9: ");
                idLopHoc = scanner.nextLine();
                ValidateUtils.validateIdLopHoc(idLopHoc);
                break;
            } catch (InputException e) {
                System.err.println("Lỗi: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Nhập Họ tên:");
                hoTen = scanner.nextLine();
                ValidateUtils.validateTen(hoTen);
                break;
            } catch (InputException e) {
                System.err.println("Lỗi: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Nhập Ngày sinh (YYYY-MM-DD):");
                ngaySinh = LocalDate.parse(scanner.nextLine());
                ValidateUtils.validateAge(ngaySinh);
                break;
            } catch (InputException | DateTimeParseException e) {
                System.err.println("Lỗi: " + e.getMessage());
            }
        }

        System.out.println("Nhập giới tính sinh viên");
        String gioiTinh = scanner.nextLine();



        while (true) {
            try {
                System.out.println("Nhập Số điện thoại:");
                soDienThoai = scanner.nextLine();
                ValidateUtils.validateSoDienThoai(soDienThoai);
                break;
            } catch (InputException e) {
                System.err.println("Lỗi: " + e.getMessage());
            }
        }


        SinhVien sinhVien =new SinhVien(idSV, hoTen, ngaySinh, gioiTinh,  soDienThoai, idLopHoc);
        return sinhVien;
    }
}
