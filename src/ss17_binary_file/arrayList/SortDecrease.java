package ss17_binary_file.arrayList;

import java.util.Comparator;

public class SortDecrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o2.getPrice(),o1.getPrice());
    }
}
