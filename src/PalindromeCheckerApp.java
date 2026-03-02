import java.util.Scanner;

public class PalindromeCheckerApp {

    // Node class for Singly Linked List
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();

        Node head = buildLinkedList(input);

        if (isPalindrome(head)) {
            System.out.println("Palindrome ✅");
        } else {
            System.out.println("Not a Palindrome ❌");
        }

        scanner.close();
    }

    // Convert String to Linked List
    public static Node buildLinkedList(String input) {
        Node head = null, tail = null;

        for (char ch : input.toCharArray()) {
            Node newNode = new Node(ch);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    // Check Palindrome using Linked List
    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle (Fast & Slow pointer)
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        // Compare halves
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Reverse linked list
    public static Node reverse(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}