import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeCheckerApp app = new PalindromeCheckerApp();
        app.start();
    }

    public void start() {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Enter text: ");
                String word = scanner.nextLine();

                if (isPalindrome(word)) {
                    System.out.println("Palindrome ✅");
                } else {
                    System.out.println("Not a Palindrome ❌");
                }

            } else if (choice == 2) {

                System.out.println("Exiting application...");
                break;

            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    public void displayMenu() {
        System.out.println("\n=================================");
        System.out.println("      PALINDROME CHECKER APP     ");
        System.out.println("=================================");
        System.out.println("1. Check Palindrome");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
    }

    public boolean isPalindrome(String word) {

        word = word.replaceAll("\\s+", "");

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        return word.equalsIgnoreCase(reversed);
    }
}