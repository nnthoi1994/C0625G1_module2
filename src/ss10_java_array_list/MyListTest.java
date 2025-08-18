package ss10_java_array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(789);
        list.add(789);
        list.add(789);
        list.add(789);
        list.add(789);
        list.add(789);
        list.add(789);
        list.add(789);
        for (int i = 0; i < list.size; i++) {
            System.out.println("array " + i + " is " + list.get(i));
            list.clear();
            list.add(99999,5);

        }
    }
}