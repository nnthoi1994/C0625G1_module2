package case_study.furama_resort.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

public class ValidateUtils {
    private static final String REGEX_ID_EMPLOYEE = "NV-\\d{4}";
    private static final String REGEX_NAME = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)+$";
    private static final String REGEX_ID_NUMBER = "\\d{9}|\\d{12}";
    private static final String REGEX_PHONE_NUMBER = "[0][1-9]{9}";

    public static boolean isIdEmployee(String idEmployee) {
        return idEmployee.matches(REGEX_ID_EMPLOYEE);
    }

    public static boolean isName(String name) {
        return name.matches(REGEX_NAME);
    }

    public static boolean isIdNumber(String idNumber) {
        return idNumber.matches(REGEX_ID_NUMBER);
    }

    public static boolean isPhoneNumber(String phoneNumber) {
        return phoneNumber.matches(REGEX_PHONE_NUMBER);
    }

    public static boolean is18YearsOld(Date dateOfBirth) {
        if(dateOfBirth==null){
            return false;
        }
        LocalDate birthDate = dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate,currentDate);
        return period.getYears()>=18;
    }
    public static boolean isValidSalary(Double salary){
        return salary>0;
    }

}
