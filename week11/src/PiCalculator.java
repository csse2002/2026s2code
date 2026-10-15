import java.util.stream.Stream;

public class PiCalculator {

    public static void main(String[] args) {
        boolean[] isPositive = {false};
        double result = Stream.iterate(1.0, x -> x + 2)
                .map(x -> 1.0 / x)
                .map(x -> {
                    isPositive[0] = !isPositive[0];
                    return isPositive[0] ? x : -x;
                })
                .limit(1000000000)
                .reduce(0.0, (curr, elem) -> curr + elem);
        System.out.println(result * 4);
    }
}
