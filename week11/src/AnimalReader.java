import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class AnimalReader {
    public static List<Animal> readAnimals(Reader reader) {
        BufferedReader buff = new BufferedReader(reader);
        return buff.lines()
                .map(line -> line.split(" "))
                .filter(components -> components.length == 3)
                .filter(components -> {
                    try {
                        Integer.parseInt(components[2]);
                        return true;
                    } catch (NumberFormatException e) {
                        return false;
                    }
                })
                .map(components -> new Animal(components[0],
                        components[1],
                        Integer.parseInt(components[2])))
                .toList();
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<Animal> animals = readAnimals(
                new FileReader("animals.txt"));
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
