package ss5_access_modifier.circle;

public class NewCircle {
    public static void main(String[] args) {
        Circle test = new Circle(2);
        System.out.println("Bán kính là: "+test.getRadius()+" và diện tích là "+test.getArea());
        Circle test2 = new Circle();
        System.out.println("Bán kính là: "+test2.getRadius()+" và diện tích là "+test2.getArea());
    }


}
