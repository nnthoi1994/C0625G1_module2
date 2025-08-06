package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng hàng");
        int row = sc.nextInt();
        System.out.println("Nhập số lượng cột");
        int column = sc.nextInt();
        int[][] myTable = new int[row][column];
        System.out.println("Nhập cột cần tính tổng");
        int columnChoice = sc.nextInt() - 1;
        int sum = 0;
        if (columnChoice + 1 > column || columnChoice < 0) {
            System.out.println("Cột bạn cần tính tổng không có");
        } else {
            for (int i = 0; i < column; i++) {
                for (int j = 0; j < row; j++) {
                    System.out.println("Nhập giá trị cho cột: " + (i + 1) + " hàng: " + (j + 1));
                    myTable[i][j] = sc.nextInt();
                    if (j == columnChoice) {
                        sum += myTable[i][j];
                    }
                }
            }
            System.out.println(Arrays.deepToString(myTable));
            System.out.println(sum);
        }
    }
}
