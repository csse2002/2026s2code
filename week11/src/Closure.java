import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Closure {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        logIterator(number -> numbers.add(number));

    }




    private static void logIterator(Consumer<Integer> f) {

    }
}
