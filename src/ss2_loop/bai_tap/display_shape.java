package ss2_loop.bai_tap;

import java.util.Scanner;

public class display_shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Tam giác vuông có cạnh góc vuông dưới");
            System.out.println("3. Tam giác vuông có cạnh góc vuông trên");
            System.out.println("4. Tam giác cân");
            System.out.println("0. Thoát");
            System.out.println("Nhập số tương ứng với hình bạn muốn hiển thị");
            choice = sc.nextInt();
            if (choice<0||choice>4){
                System.out.println("Vui lòng chọn đúng số");
            }
            switch (choice){
                case 1:
                    printRectangle();
                    break;
                case 2:
                    bottomLeftRightTriangle();
                    break;
                case 3:
                    topLeftRightTriangle();
                    break;
                case 4:
                    isoscelesTriangle();
                    break;
            }
        }
        while (choice != 0);
    }
    static void printRectangle() {


        System.out.println("Rectangle:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void bottomLeftRightTriangle() {
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void topLeftRightTriangle() {
        for (int i = 1; i < 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void isoscelesTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int k = 0; k < 5 - i; k++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }


}
