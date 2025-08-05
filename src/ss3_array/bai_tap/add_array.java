package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class add_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Nhập số lượng phần tử cần thực hiện");
        n = sc.nextInt();
        int[] myList = new int[n];
        for (int i = 0; i < myList.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            myList[i] = sc.nextInt();
        }
        System.out.println("Mảng trước khi thêm mới: " + Arrays.toString(myList));

        System.out.println("Nhập phần tử cần thêm mới");
        int addElement = sc.nextInt();

        System.out.println("Nhập vị trí phần tử cần thêm mới");
        int addIndex = sc.nextInt();
        if (addIndex < 0 || addIndex > myList.length - 1) {
            System.out.println("Không tìm thấy vị trí cần thêm mới");
        }


        for (int k = myList.length - 1; k >= addIndex; k--) {
            if (k != addIndex) {
                myList[k] = myList[k - 1];
            } else {
                myList[k] = addElement;
            }

        }
        System.out.println("Mảng sau khi thêm mới: " + Arrays.toString(myList));
    }
}
