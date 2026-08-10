package week03;

interface Growable {
    void grow();
}
class Cauliflower implements Growable {
    private int stage = 0;
    @Override
    public void grow() {
        stage++;
    }
}
class Garlic implements Growable {
    private int stage = 0;
    @Override
    public void grow() {
        stage += 2;
    }
}
class Kale implements Growable {
    private int stage = 0;
    @Override
    public void grow() {
        stage *= 2;
    }
}

class PlantGrower {
    void grow(Growable plant) {
        plant.grow();
    }
}

public class Garden {
    public static void main(String[] args) {
        Cauliflower cauliflower = new Cauliflower();
        cauliflower.grow();

        Cauliflower growable = new Cauliflower();
        PlantGrower grower = new PlantGrower();
        grower.grow(growable);
    }
}
