package chap01;

public class UnitConversion {
    public double inch;
    public double cm;
    public double f;
    public double c;

    public double getInch() {
        return inch;
    }
    public void setInch(double inch) {
        this.inch = inch;
    }
    public double getCm() {
        return cm;
    }
    public void setCm(double cm) {
        this.cm = cm;
    }
    public double getF() {
        return f;
    }
    public void setF(double f) {
        this.f = f;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }
    
    public UnitConversion(double inch, double cm, double f, double c) {
        this.inch = inch;
        this.cm = cm;
        this.f = f;
        this.c = c;
    }
    public void inchToCm(double inch) {
        cm = inch * 2.54;
    }
    public void cmToInch(double cm) {
        inch = cm / 2.54;
    }
    public void fToC(double f) {
        c = (f - 32) * 5 / 9;
    }
    public void cToF(double c) {
        f = (c * 9 / 5) + 32;
    }
    
    public void display() {
        System.out.println("inch: " + inch + " cm: " + cm);
        System.out.println("f: " + f + " c: " + c);
    }
}