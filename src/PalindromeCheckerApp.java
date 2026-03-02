import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println("Palindrome ✅");
        } else {
            System.out.println("Not a Palindrome ❌");
        }

        scanner.close();
    }

    // Recursive method
    public static boolean isPalindrome(String str, int start, int end) {

        // Base Condition
        if (start >= end) {
            return true;
        }

        // If mismatch
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }
}