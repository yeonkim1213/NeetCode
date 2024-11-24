package LinkedList.ReverseLinkedList;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Recursion {
    public ListNode reverseList(ListNode head) {
        // Base case: if the list is empty or only one node, return the head
        if (head == null || head.next == null) {
            return head;
        }

        // Recursive call: reverse the rest of the list
        ListNode newHead = reverseList(head.next);

        // Executes after base case
        // Adjust the next pointer of the current node
        head.next.next = head; // Make the next node point to the current node
        head.next = null;      // Disconnect the current node from the rest

        // Return the new head of the reversed list
        return newHead;
    }
}
