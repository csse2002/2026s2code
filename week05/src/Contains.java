public class Contains {
    /**
      * Determine if value is contained within the array.
      *
      * @requires array is sorted in ascending order.
      * @return true if value is in the array, false otherwise.
      */
    public static boolean contains(int[] array, int value) {
        for (int v : array) {
            if (v == value) {
                return true;
            }
        }
        return false;
    }
}
