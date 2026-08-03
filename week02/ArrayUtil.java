package week02;

import java.util.Arrays;

public class ArrayUtil {
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    // precondition: numbers.length > 0
    public static int max(int[] numbers) {
        int maximum = numbers[0];
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        return maximum;
    }

    public static int[] concat(int[] a1, int[] a2) {
        // a1 = [12, 24, 2]
        // a2 = [4, 5, 65]
        // result = [12, 24, 2, 0, 0, 0]
        // i = 3
        int[] result = new int[a1.length + a2.length];
        for (int i = 0; i < result.length; i++) {
            if (i < a1.length) {
                result[i] = a1[i];
            } else {
                result[i] = a2[i - a1.length];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 24, 2};
        System.out.println(sum(numbers));
        System.out.println(max(numbers));
        int[] numbers2 = {4, 5, 65};
        System.out.println(Arrays.toString(concat(numbers, numbers2)));
    }
}
