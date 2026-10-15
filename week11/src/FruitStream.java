import java.util.List;
import java.util.stream.Stream;

public class FruitStream {

    public static void main(String[] args) {
        List<Fruit> fruits = List.of(new Fruit("BANANA"),
                new Fruit("APPLE"), new Fruit("MELON"),
                new Fruit("ORANGE"), new Fruit("APPLE"),
                new Fruit("STRAWBERRY"));

        Stream<String> nameStream = fruits.stream()
                .map(fruit -> fruit.getName())
                .filter(fruit -> fruit.equals("APPLE"));

//        System.out.println(nameStream.toList());
        System.out.println(nameStream.count());
    }
}
