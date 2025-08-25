package ss19_string_regex.bai_tap.valid_phone_number;

import java.util.Scanner;

public class PhoneNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValidPhoneNumber validPhoneNumber = new ValidPhoneNumber();
        String test = "";
        boolean isvalid = false;
        do {
            System.out.println("Enter phone number to check");
            test = scanner.nextLine();
            isvalid=validPhoneNumber.validate(test);

            System.out.println("Phone Number: " + test + " is " + isvalid);
        } while (!isvalid);


    }
}
