package ss17_binary_file.arrayList;


import ss17_binary_file.arrayList.ultil.ListArrayBinaryFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private static final String FILE_PATH = "src/ss17_binary_file/arrayList/data/product.dat";
    private List<Product> products;




    public ProductManager() {

        this.products = ListArrayBinaryFile.readBinaryFile(FILE_PATH);

        if (this.products == null) {
            this.products = new ArrayList<>();
        }
    }


    public void saveToFile() {
        ListArrayBinaryFile.writeBinaryFile(FILE_PATH, products);
    }

    public void add(Product p) {
        products.add(p);
    }

    public void display() {
        if (products.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product searchByName(String nameSearch) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(nameSearch.trim())) {
                return product;
            }
        }
        return null;
    }


    public boolean removeById(int id) {
        Product productToRemove = null;
        for (Product p : products) {
            if (p.getId() == id) {
                productToRemove = p;
                break;
            }
        }
        if (productToRemove != null) {
            products.remove(productToRemove);
            return true;
        }
        return false;
    }


    public boolean edit(int id, String newName, double newPrice) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, new Product(id, newName, newPrice));
                return true;
            }
        }
        return false;
    }

    public void increase() {
        products.sort(new SortIncrease());
    }

    public void decrease() {
        products.sort(new SortDecrease());
    }


    public List<Product> getProducts() {
        return products;
    }
}

