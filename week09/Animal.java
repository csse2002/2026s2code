public class Animal {
    private String name;
    private String type;
    private int weight;

    public Animal(String name, String type, int weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public String toString() {
        return "Animal: " + this.name + this.type + this. weight;
    }
}
