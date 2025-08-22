package ss17_binary_file.arrayList;

import java.util.Comparator;

public class SortIncrease implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
