package ss7_abstract.Resizeable;

public class MainTest {
    public static void main(String[] args) {
        Shape[] shapeList = new Shape[2];
        shapeList[0] = new Square(3,6);
        shapeList[1] = new Circle(4);
        System.out.println(shapeList[0].getArea());
        System.out.println(shapeList[1].getArea());
        for (int i = 0; i < shapeList.length; i++) {
            ((IResizeable)shapeList[i]).resize(10.0);
        }
        System.out.println(shapeList[0].getArea());
        System.out.println(shapeList[1].getArea());

    }
}

