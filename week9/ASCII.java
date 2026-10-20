public class ASCII {
    public static char toUpperCase(char lower) {
        return (char) (lower & 0b11011111);
    }

    public static char toUpperCase2(char lower) {
        return (char) (lower + ('A' - 'a'));
    }

    public static void main(String[] args) {
        System.out.println(toUpperCase('e'));
        System.out.println(toUpperCase2('e'));
        System.out.println('A' - 'a');
    }
}
