package ss19_string_regex.bai_tap.valid_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidClassName {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String CLASS_NAME_REGEX = "^[ACP][0-9]{4}[GHIK]$";
    public ValidClassName() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }
        public boolean validate(String regex){
            matcher = pattern.matcher(regex);
            return matcher.matches();
        }
    }
