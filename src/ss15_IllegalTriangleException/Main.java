package ss15_IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            try {
                System.out.println("Nhập cạnh a");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh b");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập cạnh c");
                double c = Double.parseDouble(scanner.nextLine());
                TriangleApp.checkTriangle(a, b, c);
                flag = false;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi nhập chuỗi");
            }
        }
        System.out.println("3 cạnh tam giác vuông");
    }
}
