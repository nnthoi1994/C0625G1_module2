package ss15_IllegalTriangleException;

public class TriangleApp {
    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException{
        if(a<=0||b<=0||c<=0){
            throw new IllegalTriangleException("Cạnh tam giác phải là số dương");
        }
        if(a+b<=c||a+c<=b||b+c<=a){
            throw new IllegalTriangleException("Tổng 2 cạnh phải lớn hơn cạnh còn lại");
        }

    }
}
