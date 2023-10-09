public class EcuatieGrad1 {
    private double a,b;
    EcuatieGrad1(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    @Override
    public String toString() {
        return a+"x+"+b+"=0";
    }
    public double rezolva() {
        return -b/a;
    }
}
