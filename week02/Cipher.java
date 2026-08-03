package week02;

public class Cipher {
    public static String cipher(String message) {
        String result = "";
        for (char letter : message.toCharArray()) {
            int positionInAlphabet = letter - 'A';
            int offsetLetter = positionInAlphabet + 3;
            int wrapped = offsetLetter % 26;
            int ascii = wrapped + 'A';
            result = result + (char) ascii;
        }
        return result;
    }
    public static void main(String[] args) {
        String myWord = "HELLO XYZ";
        System.out.println(cipher(myWord));
    }
}
