// Time: O(n)
// Space: O(n)
// Edge cases: Empty list, Single Node, duplicate values

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
        // Base case
        if (head == null) {
            return head;
        }

        // Backtracking
        ListNode newHead = head;
        if (head.next != null) {
            newHead = reverseList(head.next);
            head.next.next = head;
        }
        head.next = null;

        // Return the new head of the reversed list
        return newHead;
    }
}
