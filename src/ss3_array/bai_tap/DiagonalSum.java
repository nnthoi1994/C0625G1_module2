package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài cạnh của ma trận vuông");
        int sideLength = sc.nextInt();
        int[][] myTable = new int[sideLength][sideLength];
        int sum = 0;
        int dup = 0;

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.println("Nhập giá trị cho cột: " + (i + 1) + " hàng: " + (j + 1));
                myTable[i][j] = sc.nextInt();
                if (i == j || i + j == sideLength - 1) {
                    sum += myTable[i][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(myTable));
        System.out.println(sum);

    }
}
