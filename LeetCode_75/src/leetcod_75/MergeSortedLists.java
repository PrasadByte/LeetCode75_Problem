package leetcod_75;


 
public class MergeSortedLists {
	static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    // Method to merge two sorted lists
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node to simplify handling the head
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Traverse both lists and insert the smaller value into result
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // If there are remaining elements in either list
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print a linked list
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
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};

        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);

        System.out.println("List1: ");
        printList(list1);

        System.out.println("List2: ");
        printList(list2);

        ListNode merged = mergeTwoLists(list1, list2);

        System.out.println("Merged List: ");
        printList(merged);
    }
}
