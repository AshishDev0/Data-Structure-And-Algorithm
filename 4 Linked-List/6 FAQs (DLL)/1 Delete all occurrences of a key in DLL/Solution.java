/*Definition of doubly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
        val = 0;
        next = null;
        prev = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        prev = null;
    }

    ListNode(int data1, ListNode next1, ListNode prev1) {
        val = data1;
        next = next1;
        prev = prev1;
    }
}
 */

class Solution {
    public ListNode deleteAllOccurrences(ListNode head, int target) {
        if (head == null) return head;

        ListNode temp = head;

        while (temp != null) {
            if (temp.val == target) {
                if (temp == head) {
                    head = temp.next;
                }

                ListNode prev = temp.prev;
                ListNode next = temp.next;

                if (prev != null) prev.next = next;
                if (next != null) next.prev = prev;
            }

            temp = temp.next;
        }

        return head;
    }
}
