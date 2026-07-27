public class NextVowel {
    static char nextVowel(char vowel) {
        return switch (vowel) {
            case 'A' -> 'E';
            case 'E' -> 'I';
            case 'U' -> 'A';
            default -> vowel;
        };
    }

    public static void main(String[] args) {
        System.out.println(nextVowel('A'));
    }
}
