package ss4_oop;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return Math.pow(this.getB(),2)- 4*this.getA()*this.getC();
    }
    public double getRoot1(){
        return (-this.getB()+Math.sqrt(this.getDiscriminant()))/(2*this.getA());
    }
    public double getRoot2(){
        return (-this.getB()-Math.sqrt(this.getDiscriminant()))/(2*this.getA());
    }
    public String result() {
        if (this.getA() == 0) {
            if (this.getB() == 0) {
                return this.getC() == 0 ? "Phương trình vô nghiệm" : "Phương trình vô số nghiệm";
            } else {
                double root3 = -this.getC() / this.getB();
                return "Phương trình bậc nhất có nghiệm là " + root3;
            }
        } else {
            if (this.getDiscriminant() >= 0) {
                return "Nghiệm 1 là: " + this.getRoot1() + " và nghiệm 2 là: " + this.getRoot2();
            } else if (this.getDiscriminant() >= 0) {
                return "Nghiệm là: " + this.getRoot1();
            } else {
                return "Vô nghiệm";
            }
        }
    }
}
