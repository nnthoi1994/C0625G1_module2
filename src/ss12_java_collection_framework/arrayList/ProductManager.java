package ss12_java_collection_framework.arrayList;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static Scanner sc = new Scanner(System.in);
    public static List<Product> products = new ArrayList<>();

    public void add(Product p) {
        products.add(p);
    }

    public static void seedProduct() {
        products.add(new Product(1, "Panadol", 4000));
        products.add(new Product(2, "Hapacol", 43000));
        products.add(new Product(3, "Gel KY", 13000));
    }

    public void display() {
        for (Product product : products) {
            System.out.println(product);
        }
    }
    public Product searchByName(String nameSearch){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getName().equals(nameSearch)){
                return products.get(i);
            }
        }
        return null;

    }
    public void removeById(int id){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == id){
                products.remove(i);
                System.out.println("Xóa thành công");
                break;
            }
        }

    }
    public void edit(int id){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == id){
                System.out.println("Nhập tên");
                String name = sc.nextLine();
                System.out.println("Nhập giá");
                double price = Double.parseDouble(sc.nextLine());
                System.out.println();
                products.set(i, new Product(id,name,price));
            }
        }
    }
    public void increase(){
        products.sort(new SortIncrease());
    }
    public void decrease(){
        products.sort(new SortDecrease());
    }

    }

