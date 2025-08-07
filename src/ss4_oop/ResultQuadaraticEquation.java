package ss4_oop;

import java.util.Scanner;

public class ResultQuadaraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a trong phương trình bậc 2");
        double  a = sc.nextDouble();
        System.out.println("Nhập số b trong phương trình bậc 2");
        double b = sc.nextDouble();
        System.out.println("Nhập số c trong phương trình bậc 2");
        double c = sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a,b,c);
        System.out.println(qe.result());
    }
}
