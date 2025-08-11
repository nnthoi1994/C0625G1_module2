package ss6_inheritance.circle;

public class Cylinder extends Circle {
    private double hight;


    public Cylinder() {
        super(); // giá trị mặc định
        this.hight = 1.0;
    }

    public Cylinder(double height) {
        super(1.0, "red"); // giá trị mặc định
        this.hight = height;
    }

    public Cylinder(double radius, String color, double hight) {
        super(radius, color);
        this.hight = hight;
    }
    public double volume(){
        return getArea()*hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return super.toString() + "Thể tích là" + volume();
    }
}
