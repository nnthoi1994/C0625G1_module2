package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class delete_array {
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

        System.out.println("Nhập phần tử cần xóa");
        int delElement = sc.nextInt();
        int delIndex = 0;
        for (int j = 0; j < myList.length; j++) {
            if (delElement == myList[j]) {
                delIndex = j;
            } else {
                System.out.println("Không tìm thấy phần tử cần xóa");
            }
        }
        for (int k = delIndex; k < myList.length; k++) {
            if (k != myList.length - 1) {
                myList[k] = myList[k + 1];
            } else {
                myList[k] = 0;
            }
        }

        System.out.println(Arrays.toString(myList));
    }
}
