package ss19_string_regex.bai_tap.valid_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;
//    private static final String PHONE_NUMBER_REGEX = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";
    private static final String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    public ValidPhoneNumber() {
        pattern = Pattern.compile(PHONE_NUMBER_REGEX);
    }
        public boolean validate(String regex){
            matcher = pattern.matcher(regex);
            return matcher.matches();
        }
    }
