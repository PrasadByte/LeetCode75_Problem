package arrays;

public class AddTwoNumbers {
	 // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Function to add two numbers represented as linked lists
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy node to build the result list
        ListNode current = dummyHead;
        int carry = 0;

        // Traverse both lists
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            int digit = sum % 10;
            current.next = new ListNode(digit);
            current = current.next;
        }

        return dummyHead.next; // Skip dummy head
    }

    // Helper function to create a linked list from an array
    public static ListNode createList(int[] nums) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper function to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] num1 = {2, 4, 3};
        int[] num2 = {5, 6, 4};

        ListNode l1 = createList(num1);
        ListNode l2 = createList(num2);

        System.out.print("Input l1: ");
        printList(l1);
        System.out.print("Input l2: ");
        printList(l2);

        ListNode result = addTwoNumbers(l1, l2);
        System.out.print("Output:   ");
        printList(result);
    }
}