public class PalindromePerformanceTest {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Iterative
        long start = System.nanoTime();
        boolean iterativeResult = iterativePalindrome(input);
        long end = System.nanoTime();
        long iterativeTime = end - start;

        // Recursive
        start = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(
                normalize(input), 0, normalize(input).length() - 1);
        end = System.nanoTime();
        long recursiveTime = end - start;

        // Stack Strategy
        PalindromeStrategy stackStrategy = new StackStrategy();
        start = System.nanoTime();
        boolean stackResult = stackStrategy.check(input);
        end = System.nanoTime();
        long stackTime = end - start;

        // Deque Strategy
        PalindromeStrategy dequeStrategy = new DequeStrategy();
        start = System.nanoTime();
        boolean dequeResult = dequeStrategy.check(input);
        end = System.nanoTime();
        long dequeTime = end - start;

        System.out.println("=== PERFORMANCE COMPARISON ===");
        System.out.println("Iterative Time: " + iterativeTime + " ns");
        System.out.println("Recursive Time: " + recursiveTime + " ns");
        System.out.println("Stack Time:     " + stackTime + " ns");
        System.out.println("Deque Time:     " + dequeTime + " ns");
    }

    public static String normalize(String input) {
        return input.replaceAll("\\s+", "").toLowerCase();
    }

    public static boolean iterativePalindrome(String input) {

        String str = normalize(input);

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean recursivePalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return recursivePalindrome(str, start + 1, end - 1);
    }
}