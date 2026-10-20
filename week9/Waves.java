public class Waves {
    public static void main(String[] args) throws InterruptedException {
        int[] modifiers = new int[]{
                0x1F3FB,
                0x1F3FC,
                0x1F3FD,
                0x1F3FE,
                0x1F3FF,
        };
        int index = 0;
        while (true) {
            char[] modifier = Character.toChars(modifiers[index % modifiers.length]);
            System.out.print(Character.toChars(0x1F44B)); // hand wave
            //System.out.print(Character.toChars(0x1F596)); // Vulcan salute
            System.out.print(modifier);
            index++;
            Thread.sleep(500); // milliseconds
        }
    }
}
