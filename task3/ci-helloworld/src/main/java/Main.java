public class Main {
    public static void main(String[] args) {
        int[] sample = {1, 2, 2, 3, 4, 2};
        int target = 2;
        int occurrences = ArrayUtils.countOf(sample, target);
        System.out.println("Hello CI/CD. Count of " + target + " is " + occurrences);
    }
}
