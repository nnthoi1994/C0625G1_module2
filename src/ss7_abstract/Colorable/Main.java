package ss7_abstract.Colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3);
        shapes[1] = new Square(3, 5);
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Colorable) {
                ((Colorable) shapes[i]).howToColor();
            }
        }
    }
}
