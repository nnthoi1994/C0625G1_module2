package case_study.furama_resort.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class ValidateUtils {
    private static final String REGEX_ID_EMPLOYEE = "NV-\\d{4}";
    private static final String REGEX_ID_CUSTOMER = "KH-\\d{4}";
    private static final String REGEX_NAME = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";
    private static final String REGEX_ID_NUMBER = "\\d{9}|\\d{12}";
    private static final String REGEX_PHONE_NUMBER = "[0][1-9]{9}";

    public static void isIdEmployee(String idEmployee) throws InputException{
        if(!idEmployee.matches(REGEX_ID_EMPLOYEE)) throw new InputException("Sai cấu trúc mã nhân viên (NV-XXXX)");
    }

    public static void isIdCustomer(String idCustomer) throws InputException{
        if(!idCustomer.matches(REGEX_ID_CUSTOMER)) throw new InputException("Sai cấu trúc mã khách hàng (KH-XXXX)");
    }

    public static void isName(String name) throws InputException{
        if(!name.matches(REGEX_NAME)) throw new InputException("Sai cấu trúc tên, tên phải bắt đầu bằng chữ hoa");
    }

    public static boolean isIdNumber(String idNumber) {
        return idNumber.matches(REGEX_ID_NUMBER);
    }

    public static boolean isPhoneNumber(String phoneNumber) {
        return phoneNumber.matches(REGEX_PHONE_NUMBER);
    }

    public static void is18YearsOld(Date dateOfBirth) throws InputException{
//        if (dateOfBirth == null) {
//            return false;
//        }
        LocalDate birthDate = dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        if(period.getYears()<18){
            throw new InputException("Tuổi phải lớn hơn bằng 18");
        };

    }

    public static boolean isValidSalary(Double salary) {
        return salary > 0;
    }

}
