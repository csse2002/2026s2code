import java.util.Random;

public class Patron {
    private String name;

    public Patron(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patron (name=" + name + ")";
    }

    public int getAge() {
        return new Random().nextInt(15, 25);
    }

    public boolean hasValidId() {
        return new Random().nextBoolean();
    }

    public double getBloodAlcoholTest() {
        return new Random().nextDouble(0.001, 0.3);
    }

}
