package ss4_oop.fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,10,"red");
        Fan fan2 = new Fan(2,false,5,"red");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
