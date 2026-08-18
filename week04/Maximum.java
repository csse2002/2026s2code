package week04;

import java.util.Optional;

public class Maximum {
    /**
     * @requires numbers.length > 0
     */
    public static Optional<Integer> maximum(int[] numbers) {
        if (numbers.length == 0) {
            return Optional.empty();
        }
        int maxSeen = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > maxSeen) {
                maxSeen = number;
            }
        }
        return Optional.of(maxSeen);
    }

    public static void main(String[] args) {
        Optional<Integer> theMax = maximum(new int[]{1, 2, 3});
        if (theMax.isPresent()) {
            int nextValue = theMax.get() + 1;
        } else {
            System.out.println("ERROR!!!");
        }
    }
}
