import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        if (checker.checkPalindrome(input)) {
            System.out.println("Palindrome ✅");
        } else {
            System.out.println("Not a Palindrome ❌");
        }

        scanner.close();
    }
}