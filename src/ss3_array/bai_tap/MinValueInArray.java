package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MinValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int min = 0;
        System.out.println("Nhập số lượng phần tử cần tìm giá trị nhỏ nhất");
        n = sc.nextInt();
        int[] myList = new int[n];
        for (int i = 0; i < myList.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            myList[i] = sc.nextInt();
        }
        System.out.println("Mảng sau khi nhập các phần tử: " + Arrays.toString(myList));
        min = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] < min) {
                min = myList[i];
            }
        }
        System.out.println("Gíá trị nhỏ nhất là: " + min);
    }
}