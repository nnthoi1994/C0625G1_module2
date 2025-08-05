package ss3_array.bai_tap;

import java.util.Scanner;

public class max_value_in_matrix_array {
    public static void main(String[] args) {
        int max = 0;
        int[][] matrix = {{1, 2, 8}, {3, 4, 5}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất là: " + max);
    }
}