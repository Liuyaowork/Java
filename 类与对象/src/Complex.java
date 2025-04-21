public class Complex {

    private double real;
    private double image;


    public Complex() {
        this.real = 0.0;
        this.image = 0.0;
    }

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }


    public double getReal() {
        return real;
    }

    public double getImage() {
        return image;
    }


    public void setReal(double real) {
        this.real = real;
    }

    public void setImage(double image) {
        this.image = image;
    }


    public void show() {
        if (image == 0) {
            System.out.println(real);
        } else if (image > 0) {
            System.out.println(real + " + " + image + "i");
        } else {
            System.out.println(real + " - " + (-image) + "i");
        }
    }
}
