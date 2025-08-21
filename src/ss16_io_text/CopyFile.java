package ss16_io_text;

import ss8_clean_code.util.ReadWrite;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {


    File f1 = new File("src/ss16_io_text/file1.csv") ;
    final String pathFile2 = "src/ss16_io_text/file2.csv";
    List<String> stringList = List.of();

    {
        try {
            stringList = ReadWrite.readFileCSV("src/ss16_io_text/file1.csv");
            ReadWrite.writeFileCSV(pathFile2, stringList, false);
            System.out.println(stringList);
            System.out.println("Sao chep thanh cong");
            System.out.println(f1.length());

        } catch (IOException e) {
            System.out.println("Không tìm thấy file");;
        }
    }

}
}