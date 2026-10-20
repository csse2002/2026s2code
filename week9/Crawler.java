import java.util.Random;

public class Crawler {
    private static Random random = new Random();
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.print("#");
            Thread.sleep(1000);
            System.out.print("\b"); // \b is the backspace character or ((char) 8);
            System.out.print(" ");
            if (random.nextInt(3) == 1) {
                System.out.print("\r"); // \r is the carriage return character or ((char) 13);
            }
        }
    }
}
