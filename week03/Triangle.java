package week03;

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

        System.out.println(triangle.equals(triangle2));
    }
}
