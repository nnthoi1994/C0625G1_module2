package case_study.quan_ly_sv.utils;

import java.time.LocalDate;
import java.time.Period;

public class ValidateUtils {
    private static final String REGEX_ID_SINH_VIEN = "SV-\\d{4}";
    private static final String REGEX_ID_LOP_HOC = "LOP-\\d{4}";
    private static final String REGEX_TEN = "^[A-Za-z]*$";
    private static final String REGEX_SO_DIEN_THOAI = "(090|091)\\d{7}";
    private static final String REGEX_EMAIL = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";


    public static void validateIdSinhVien(String idSV) throws InputException {
        if(!idSV.matches(REGEX_ID_SINH_VIEN)) throw new InputException("Sai cấu trúc mã sinh viên (SV-XXXX), X là số từ 0-9");
    }

    public static void validateIdLopHoc(String idLopHoc) throws InputException {
        if(!idLopHoc.matches(REGEX_ID_LOP_HOC)) throw new InputException("Sai cấu trúc mã lớp học (LOP-XXXX), X là số từ 0-9");
    }

    public static void validateTen(String ten) throws InputException {
        if(!ten.matches(REGEX_TEN)) throw new InputException("Tên sinh viên phải từ 4 đến 50 kí tự. Vui lòng nhập lại.");
    }
    public static void validateSoDienThoai(String soDienThoai) throws InputException {
        if(!soDienThoai.matches(REGEX_SO_DIEN_THOAI)) throw new InputException("Bạn nhập sai định dạng 090xxxxxxx hoặc 091xxxxxxx và chỉ dùng chữ sô. Vui lòng nhập lại: ");
    }

    public static void validateAge(LocalDate ngaySinh) throws InputException {
        if (Period.between(ngaySinh, LocalDate.now()).getYears() < 18) {
            throw new InputException("Tuổi phải lớn hơn hoặc bằng 18");
        }
    }

    public static void validateEmail(String email) throws InputException {
        if(!email.matches(REGEX_EMAIL)) throw new InputException("Sai cấu trúc địa chỉ email, phải bao gồm tên email + @ + tên miền email (Ví dụ thoi@gmail.com");
    }


}

//[] → character class: [abc] = a hoặc b hoặc c.
//
//        {} → số lần lặp: a{2} = "aa", a{2,4} = "aa", "aaa", "aaaa".
//
//        ? → 0 hoặc 1 lần lặp. "colou?r" = "color" hoặc "colour".
//
//        * → 0 hoặc nhiều lần. "ab*" = "a", "ab", "abb", "abbbb"...
//
//        + → ít nhất 1 lần. "ab+" = "ab", "abb", "abbbb"...
//
//        ^ → bắt đầu chuỗi. ^Java = chuỗi bắt đầu bằng "Java".
//
//$ → kết thúc chuỗi. end$ = chuỗi kết thúc bằng "end".
//
//        \w → word character = [a-zA-Z0-9_].
//
//        \d → digit = [0-9].
//
//        \s → whitespace (space, tab, newline).
