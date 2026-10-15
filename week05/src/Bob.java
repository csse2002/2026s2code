public class Bob {
    private int value;

    public Bob() {
        this.value = 0;
    }

    public Bob(int value) {
//        if (value < 0) {
//            throw new IllegalArgumentException();
//        }
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
