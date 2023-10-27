package Ex_2;

public class Punct {
    private double x,y;
    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Punct() {
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "("+this.x+","+this.y+")";
    }
    public double distanta(Punct p) {
        try {
            double sum1 = (this.x - p.x) * (this.x - p.x);
            double sum2 = (this.y - p.y) * (this.y - p.y);
            double sum = sum1 + sum2;
            return Math.sqrt(sum);
        }
        catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
}
