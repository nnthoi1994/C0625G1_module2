package ss1_tong_quan_java.bai_tap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn đọc");
        int number = sc.nextInt();
        String str = "";
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    System.out.println("Số không");
                    break;
                case 1:
                    System.out.println("Số một");
                    break;
                case 2:
                    System.out.println("Số hai");
                    break;
                case 3:
                    System.out.println("Số ba");
                    break;
                case 4:
                    System.out.println("Số bốn");
                    break;
                case 5:
                    System.out.println("Số năm");
                    break;
                case 6:
                    System.out.println("Số sáu");
                    break;
                case 7:
                    System.out.println("Số bảy");
                    break;
                case 8:
                    System.out.println("Số tám");
                    break;
                case 9:
                    System.out.println("Số chín");
                    break;

            }
        }  else if (number>=10&&number<20){
            switch (number) {
                case 10:
                    System.out.println("Số mười");
                    break;
                case 11:
                    System.out.println("Số mười một");
                    break;
                case 12:
                    System.out.println("Số mười hai");
                    break;
                case 13:
                    System.out.println("Số mười ba");
                    break;
                case 14:
                    System.out.println("Số mười bốn");
                    break;
                case 15:
                    System.out.println("Số mười năm");
                    break;
                case 16:
                    System.out.println("Số mười sáu");
                    break;
                case 17:
                    System.out.println("Số mười bảy");
                    break;
                case 18:
                    System.out.println("Số mười tám");
                    break;
                case 19:
                    System.out.println("Số mười chín");
                    break;
            }
        } else if(number>=20&&number<100){
            int chuc  = number/10;
            int donVi = number%10;
            switch (chuc) {
                case 2:
                    str += "Số Hai mươi";
                    break;
                case 3:
                    str += "Số Ba mươi";
                    break;
                case 4:
                    str += "Số Bốn mươi";
                    break;
                case 5:
                    str += "Số Năm mươi";
                    break;
                case 6:
                    str += "Số Sáu mươi";
                    break;
                case 7:
                    str += "Số Bảy mươi";
                    break;
                case 8:
                    str += "Số Tám mươi";
                    break;
                case 9:
                    str += "Số Chín mươi";
                    break;
            }
            switch (donVi){
                case 1:
                    str += " Mốt";
                    break;
                case 2:
                    str += " Hai";
                    break;
                case 3:
                    str += " Ba";
                    break;
                case 4:
                    str += " Bốn";
                    break;
                case 5:
                    str += " Năm";
                    break;
                case 6:
                    str += " Sáu";
                    break;
                case 7:
                    str += " Bảy";
                    break;
                case 8:
                    str += " Tám";
                    break;
                case 9:
                    str += " Chín";
                    break;
            }


            System.out.println(str);
        } else if (number>=100&&number<1000){

        }

    }
}
