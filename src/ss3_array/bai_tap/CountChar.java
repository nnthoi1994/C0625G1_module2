package ss3_array.bai_tap;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Nguyen Ngoc Thoi";
        System.out.println("Nhập kí tự cần kiểm tra");
        String charFind = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (charFind.charAt(0) == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
