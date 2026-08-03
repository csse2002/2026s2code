package week02;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.perimeter());
        Triangle bigger = triangle.scale(2);
        System.out.println(bigger.perimeter());
    }
}
