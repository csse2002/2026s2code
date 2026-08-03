package week02;

public class Triangle {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        this(1, 1, 1);
    }

    public boolean isValid() {
        return false;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return a + b + c;
    }

    public Triangle scale(double multiplier) {
        return new Triangle(a * multiplier, b * multiplier, c * multiplier);
    }
}
