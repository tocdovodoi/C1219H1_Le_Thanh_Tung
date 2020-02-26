package ThucHanhLopDongVat.PhuongTrinhBac2;

public class PTBac2 {
    private double a;
    private double b;
    private double c;

    public double getDenta() {
        return (b * b - 4 * a * c);
    }

    public double root1() {
        return (-b - Math.sqrt(getDenta()) / (2 * a));
    }

    public double root2() {
        return (-b + Math.sqrt(getDenta()) / (2 * a));
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

    public PTBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}
