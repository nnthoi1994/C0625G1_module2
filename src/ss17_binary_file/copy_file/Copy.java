package ss17_binary_file.copy_file;

import ss17_binary_file.arrayList.ultil.ListArrayBinaryFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file cần sao chép");
        String path1 = scanner.nextLine();
        System.out.println("Nhập đường dẫn vị trí file cần dán");
        String path2 = scanner.nextLine();
        if (copy(path1, path2)) {
            System.out.println("Copy thanh cong");

        } else {
            System.out.println("Copy thất bại ");
        }

    }

        public static boolean copy (String path1, String path2){
            Scanner scanner = new Scanner(System.in);
            File f1 = new File(path1);
            File f2 = new File(path2);
            List<String> stringList = null;
            if(!f1.exists()){
                System.out.println("Khong tim thay file 1");
            } else if(f2.exists()){
                System.out.println("File bạn muốn dán đã tồn tại, bạn có muốn lưu đè (y/n)");
                String overWrite = scanner.nextLine();
                if(overWrite.equals("y")){
                    stringList = ListArrayBinaryFile.readBinaryFile(path1);
                    ListArrayBinaryFile.writeBinaryFile(path2, stringList);
                    System.out.println(stringList);
                    System.out.println(f1.length());
                } else return false;
            } else {
                stringList = ListArrayBinaryFile.readBinaryFile(path1);
                ListArrayBinaryFile.writeBinaryFile(path2, stringList);
                System.out.println(stringList);
                System.out.println(f1.length());
            }
            return true;
            }

        }


