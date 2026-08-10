package week03;

/**
 * A utility class to perform cryptographic operations.
 */
public class Cipher {
    /**
     * Perform a Caesar cipher by shifting each character by three.
     *
     * @param message The message to encrypt.
     * @return The result of performing a Caesar cipher shift.
     */
    static String cipher(String message) {
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            // shift down by 3
            int offset = message.charAt(i) + 3;
            // wrap around the alphabet
            int wrapped = ((offset - 'A') % 26) + 'A';
            // cast back into a character
            char next = (char) wrapped;

            result = result + next;
        }
        return result;
    }

    public static int cipher(int message) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(cipher("HELLO"));
        System.out.println(cipher("XYZ"));
        System.out.println(cipher("ABC"));

        System.out.println(cipher(123));
    }
}