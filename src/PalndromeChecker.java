public class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        String normalized = input
                .replaceAll("\\s+", "")
                .toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}