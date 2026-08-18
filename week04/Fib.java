package week04;

import java.io.FileNotFoundException;

public class Fib {
    /**
     * Calculates the nth value of the fib sequence.
     *
     * @requires n >= 0
     * @param n The index within the fib sequence.
     * @return The nth value of the fib sequence.
     * @throws FileNotFoundException If n is less than zero.
     */
    public static int fib(int n) throws FileNotFoundException {
        if (n < 0) {
            throw new FileNotFoundException();
        }
        if (n <= 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        try {
            fib(-2);
        } catch (FileNotFoundException e) {
            //
        }
    }
}
