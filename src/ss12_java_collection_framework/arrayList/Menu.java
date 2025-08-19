package ss12_java_collection_framework.arrayList;

import java.util.Scanner;

    public class Menu {
        private ProductManager pm = new ProductManager();
        public  void displayMainMenu(){
            Scanner sc = new Scanner(System.in);
            pm.seedProduct();
            final int DISPLAY = 1;
            final int ADD = 2;
            final int DELETE = 3;
            final int SEARCH = 4;
            final int EDIT = 5;
            final int INCREASE = 6;
            final int DECREASE = 7;



            boolean flag = true;
            while (flag) {

                System.out.println("Quản lý sản phẩm");
                System.out.println("-------Chức năng------" +
                        "\n 1. Danh sách" +
                        "\n 2. Thêm mới" +
                        "\n 3. Xoá" +
                        "\n 4. Tìm kiếm" +
                        "\n 5. Chỉnh sửa"+
                        "\n 6. Tăng"+
                        "\n 7. Giảm"+
                        "\n 8. Thoat");

                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case DISPLAY:
                        pm.display();
                        break;
                    case SEARCH:
                        System.out.println("Nhập tên cần tìm kiếm");
                        String nameSearch = sc.nextLine();
                        Product search = pm.searchByName(nameSearch);
                        if (search == null) {
                            System.out.println("Tên không tồn tại");
                        } else {
                            System.out.println(search);
                        }
                        break;
                    case DELETE:
                        boolean flagDel = false;
                        System.out.println("Nhập ID cần xóa");
                        int idDel = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < ProductManager.products.size(); i++) {
                            if (idDel == ProductManager.products.get(i).getId()) {
                                pm.removeById(idDel);
                                flagDel = true;
                                break;
                            }
                        }
                        if(!flagDel) {
                            System.out.println("Not found");
                        }

                            break;
                            case ADD:
                                System.out.println("Đây là chức năng thêm mới, vui lòng nhập ID");
                                int id = Integer.parseInt(sc.nextLine());
                                System.out.println("Nhập tên");
                                String name = sc.nextLine();
                                System.out.println("Nhập giá");
                                double price = Double.parseDouble(sc.nextLine());
                                pm.add(new Product(id,name,price));
                                System.out.println("Add success");
                            break;
                    case EDIT:
                        boolean flagEdit = false;
                        System.out.println("Đây là chức năng sửa, vui lòng nhập ID");
                        int idEdit = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < ProductManager.products.size(); i++) {
                            if (idEdit == ProductManager.products.get(i).getId()) {
                                pm.edit(idEdit);
                                flagEdit = true;
                                break;
                            }
                        }
                        if(!flagEdit) {
                            System.out.println("Not found");
                        }
                        break;
                    case INCREASE:
                        pm.increase();
                        pm.display();
                        break;
                    case DECREASE:
                        pm.decrease();
                        pm.display();
                        break;
                            default:

                                flag = false;
                        }
                }
            }
        }


