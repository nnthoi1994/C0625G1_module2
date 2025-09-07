package case_study.quan_ly_sv.controller;

import case_study.quan_ly_sv.entity.SinhVien;
import case_study.quan_ly_sv.service.ISinhVienService;
import case_study.quan_ly_sv.service.SinhVienService;
import case_study.quan_ly_sv.view.SinhVienView;
import ss8_clean_code.entity.Car;
import ss8_clean_code.view.CarView;

import java.util.List;
import java.util.Scanner;

public class QuanLySinhVienController {
    private ISinhVienService sinhVienService = new SinhVienService();
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        boolean flag = true;
        while (flag) {
            System.out.println("Quản lý sinh viên");
            System.out.println("-------Function------" +
                    "\n 1. Danh sách sinh viên" +
                    "\n 2. Thêm mới sinh viên" +
                    "\n 3. Xóa sinh viên" +
                    "\n 4. Tìm kiếm sinh viên" +
                    "\n 5. Quay lại menu chính");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY:
                    System.out.println("Danh sách sinh viên");
                    List<SinhVien> sinhVienList = this.sinhVienService.findAll();
                    SinhVienView.display(sinhVienList);
                    break;
                case ADD:
                    System.out.println("Đây là chức năng thêm mới");
                    SinhVien sinhVien = SinhVienView.nhapSinhVien();
                    this.sinhVienService.add(sinhVien);
                    System.out.println("Thêm mới sinh viên thành công");
                    break;
                case DELETE:
                    System.out.println("Đây là chức năng xóa, nhập mã sinh viên để xóa");
                    String idSV = scanner.nextLine();
                    sinhVien = this.sinhVienService.findById(idSV);

                    if (this.sinhVienService.delete(idSV)) {
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Không tìm thấy mã sinh viên");
                    }

                    break;
                case SEARCH:
                    System.out.println("This is search function \n Please enter number control of car");
                    String tenSV = scanner.nextLine();
                    this.sinhVienService.search(tenSV);
                    List<SinhVien> searchList = this.sinhVienService.search(tenSV);
                    if (!searchList.isEmpty()) {
                        SinhVienView.display(searchList);
                    } else {
                        System.out.println("Not found");
                    }
                    break;


            }
        }
    }
}
