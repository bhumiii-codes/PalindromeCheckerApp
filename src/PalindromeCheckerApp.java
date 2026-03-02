import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        String normalized = normalize(input);

        if (isPalindrome(normalized)) {
            System.out.println("Palindrome ✅");
        } else {
            System.out.println("Not a Palindrome ❌");
        }

        scanner.close();
    }

    // Step 1: Normalize string
    public static String normalize(String input) {

        return input
                .replaceAll("\\s+", "")   // remove spaces
                .toLowerCase();           // convert to lowercase
    }

    // Step 2: Apply palindrome logic
    public static boolean isPalindrome(String str) {

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
}