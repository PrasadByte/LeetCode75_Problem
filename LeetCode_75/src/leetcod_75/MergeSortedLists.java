// Declare the package (optional, based on your project structure)
package leetcod_75;

public class MergeSortedLists {

    // Inner class representing a node in the singly linked list
    static class ListNode {
        int val;         // Value of the node
        ListNode next;   // Pointer to the next node

        // Constructor to initialize the node value
        ListNode(int val) {
            this.val = val;
        }
    }

    // Method to merge two sorted linked lists
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to simplify list merging logic
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;  // Pointer to build the new list

        // Traverse both lists while both are not empty
        while (list1 != null && list2 != null) {
            // Compare values and pick the smaller node
            if (list1.val <= list2.val) {
                current.next = list1;  // Link to list1's node
                list1 = list1.next;    // Move to next node in list1
            } else {
                current.next = list2;  // Link to list2's node
                list2 = list2.next;    // Move to next node in list2
            }
            current = current.next;    // Move forward in the result list  f
        }

        // Attach remaining nodes from the non-empty list
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Return the merged list, skipping the dummy node
        return dummy.next;
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(-1);  // Dummy head
        ListNode current = dummy;

        // Convert array elements into linked list nodes
        for (int val : arr) {
            current.next = new ListNode(val); // Create and link new node
            current = current.next;           // Move to next node
        }

        return dummy.next;  // Return actual head of the list
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);       // Print current node value
            if (head.next != null)
                System.out.print(" -> ");     // Separator if not last node
            head = head.next;                 // Move to next node
        }
        System.out.println();  // Newline after printing list
    }

    // Main method: entry point of the program
    public static void main(String[] args) {
        // Create two input arrays (sorted lists)
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};

        // Convert arrays to linked lists
        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);

        // Print the original lists
        System.out.println("List1: ");
        printList(list1);

        System.out.println("List2: ");
        printList(list2);

        // Merge the two sorted lists
        ListNode merged = mergeTwoLists(list1, list2);

        // Print the merged sorted list
        System.out.println("Merged List: ");
        printList(merged);
    }
}
