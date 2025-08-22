package ss17_binary_file.arrayList;

import java.util.Scanner;

public class Menu {
    private final ProductManager pm = new ProductManager();

    public void displayMainMenu() {
        Scanner sc = new Scanner(System.in);


        final int DISPLAY = 1;
        final int ADD = 2;
        final int DELETE = 3;
        final int SEARCH = 4;
        final int EDIT = 5;
        final int INCREASE = 6;
        final int DECREASE = 7;
        final int EXIT = 8;

        boolean flag = true;
        while (flag) {
            System.out.println("\n--- HỆ THỐNG QUẢN LÝ SẢN PHẨM ---");
            System.out.println("------- Chức năng -------" +
                    "\n 1. Hiển thị danh sách" +
                    "\n 2. Thêm mới sản phẩm" +
                    "\n 3. Xoá sản phẩm" +
                    "\n 4. Tìm kiếm theo tên" +
                    "\n 5. Chỉnh sửa thông tin sản phẩm" +
                    "\n 6. Sắp xếp giá tăng dần" +
                    "\n 7. Sắp xếp giá giảm dần" +
                    "\n 8. Thoát");
            System.out.print("Chọn số đi fen: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case DISPLAY:
                        System.out.println("--- Danh sách sản phẩm ---");
                        pm.display();
                        break;
                    case SEARCH:
                        System.out.print("Nhập tên sản phẩm cần tìm: ");
                        String nameSearch = sc.nextLine();
                        Product search = pm.searchByName(nameSearch);
                        if (search == null) {
                            System.out.println("Tên sản phẩm không tồn tại.");
                        } else {
                            System.out.println("Đã tìm thấy: " + search);
                        }
                        break;
                    case DELETE:
                        System.out.print("Nhập ID sản phẩm cần xóa: ");
                        int idDel = Integer.parseInt(sc.nextLine());
                        if (pm.removeById(idDel)) {
                            System.out.println("Xóa thành công!");
                            pm.saveToFile();
                        } else {
                            System.out.println("Không tìm thấy ID sản phẩm để xóa.");
                        }
                        break;
                    case ADD:
                        System.out.println("--- Thêm sản phẩm mới ---");
                        System.out.print("Nhập ID: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Nhập tên: ");
                        String name = sc.nextLine();
                        System.out.print("Nhập giá: ");
                        double price = Double.parseDouble(sc.nextLine());
                        pm.add(new Product(id, name, price));
                        pm.saveToFile();
                        System.out.println("Thêm mới thành công!");
                        break;
                    case EDIT:
                        System.out.print("Nhập ID sản phẩm cần sửa: ");
                        int idEdit = Integer.parseInt(sc.nextLine());
                        boolean isExist = pm.getProducts().stream().anyMatch(p -> p.getId() == idEdit);

                        if (isExist) {
                            System.out.print("Nhập tên mới: ");
                            String newName = sc.nextLine();
                            System.out.print("Nhập giá mới: ");
                            double newPrice = Double.parseDouble(sc.nextLine());
                            pm.edit(idEdit, newName, newPrice);
                            pm.saveToFile();
                            System.out.println("Cập nhật thành công!");
                        } else {
                            System.out.println("Không tìm thấy ID sản phẩm này.");
                        }
                        break;
                    case INCREASE:
                        pm.increase();
                        pm.saveToFile();
                        System.out.println("Đã sắp xếp giá tăng dần.");
                        pm.display();
                        break;
                    case DECREASE:
                        pm.decrease();
                        pm.saveToFile();
                        System.out.println("Đã sắp xếp giá giảm dần.");
                        pm.display();
                        break;
                    case EXIT:
                        System.out.println("Cảm ơn đã sử dụng chương trình!");
                        flag = false;
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Định dạng nhập vào không đúng, vui lòng nhập số.");
            }
        }
    }
}