package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class concatnate_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Nhập số lượng phần tử của mảng 1");
        n = sc.nextInt();
        int[] myList = new int[n];
        for (int i = 0; i < myList.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            myList[i] = sc.nextInt();
        }

        int m = 0;
        System.out.println("Nhập số lượng phần tử của mảng 2");
        m = sc.nextInt();
        int[] myList2 = new int[m];
        for (int i = 0; i < myList2.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            myList2[i] = sc.nextInt();
        }

        int k = m + n;
        int[] myList3 = new int[k];
        for (int i = 0; i < myList.length; i++) {
            myList3[i] = myList[i];
        }
        for (int i = 0; i < myList2.length; i++) {
            myList3[i + n] = myList2[i];
        }
        System.out.println("Mảng thứ 3 sau khi cộng 2 mảng: " + Arrays.toString(myList3));
    }


}
