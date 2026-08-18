package week04;

public class Triangle {
    private double a, b, c;

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

    public int scale(double multiplier) {
        if (multiplier < 0) {
            return 1;
        }
        this.a *= multiplier;
        this.b *= multiplier;
        this.c *= multiplier;
        return 0;
    }

    @Override
    public String toString() {
        return "Triangle(" + a + ", " + b + ", " + c + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangle triangle) {
            return a == triangle.a && b == triangle.b && c == triangle.c;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (int) (a * b * c);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(2, 3, 4);
        Triangle triangle2 = new Triangle(2, 3, 4);

        triangle.scale(2.0);
        System.out.println(triangle.equals(triangle2));
    }
}
