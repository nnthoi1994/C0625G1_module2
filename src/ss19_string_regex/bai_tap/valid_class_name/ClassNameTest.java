package ss19_string_regex.bai_tap.valid_class_name;

import java.util.Scanner;

public class ClassNameTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidClassName validClassName = new ValidClassName();
        String test = "";
        boolean isvalid = false;
        do {
            System.out.println("Enter class name to check");
            test = scanner.nextLine();
            isvalid=validClassName.validate(test);

            System.out.println("Class name: " + test + " is " + isvalid);
        } while (!isvalid);


    }
}
