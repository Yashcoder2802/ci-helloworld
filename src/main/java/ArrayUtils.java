public class ArrayUtils {

    private ArrayUtils() {
        // utility class
    }

    /**
     * Counts how many times target appears in the array.
     */
    public static int countOf(int[] x, int target) {
        int count = 0;
        for (int a : x) {
            count = (a == target) ? count + 1 : count;
        }
        return count;
    }
}
