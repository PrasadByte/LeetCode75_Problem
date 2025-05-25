package arrays;

public class AddTwoNumbers {

    // Definition for singly-linked list node
    static class ListNode {
        int val;         // Value of the node (single digit)
        ListNode next;   // Reference to the next node

        ListNode(int val) {
            this.val = val;
        }
    }

    // Function to add two numbers represented by linked lists
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy head to simplify result list creation
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0; // Variable to store carry during addition

        // Loop until both lists are completely traversed and carry is 0
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with carry

            // Add value from l1 if available
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; //Move to next node
            }

            // Add value from l2 if available
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; // Move to next node
            }

            // Calculate new carry for next digit
            carry = sum / 10;
            int digit = sum % 10; // Get the digit to store in the result

            //Create a new node with the digit and link it
            current.next = new ListNode(digit);
            current = current.next; // Move to the new node
        }

        //Return the next of dummy node which is the actual result head
        return dummyHead.next;
    }

    // Helper function to convert an integer array to a linked list
    public static ListNode createList(int[] nums) {
        ListNode dummy = new ListNode(0); // Dummy head
        ListNode current = dummy;

        // Loop through the array and create nodes
        for (int num : nums) {
            current.next = new ListNode(num); // Add new node
            current = current.next; // Move forward
        }

        return dummy.next; // Return actual head of the list
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val); // Print current value
            if (head.next != null) System.out.print(" -> "); // Arrow for next node
            head = head.next; // Move to next node
        }
        System.out.println(); // New line after printing list
    }

  
    public static void main(String[] args) {
        // Input arrays representing two numbers in reverse order
        int[] num1 = {2, 4, 3}; // Represents 342
        int[] num2 = {5, 6, 4}; // Represents 465

        // Convert arrays to linked lists
        ListNode l1 = createList(num1);
        ListNode l2 = createList(num2);

        // Print input linked lists
        System.out.print("Input l1: ");
        printList(l1);
        System.out.print("Input l2: ");
        printList(l2);

        // Add the two numbers and get the result list
        ListNode result = addTwoNumbers(l1, l2);

        // Print the result linked list
        System.out.print("Output:   ");
        printList(result); // Should print 7 -> 0 -> 8 (807)
    }
}
