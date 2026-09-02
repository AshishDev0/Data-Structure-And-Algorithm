/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    private int helper(ListNode head) {
        if (head == null) {
            return 1;
        }

        int carry = helper(head.next);

        head.val = head.val + carry;

        if (head.val < 10) {
            return 0;
        }

        head.val = 0;
        return 1;
    }

    public ListNode addOne(ListNode head) {
        int carry = helper(head);

        if (carry > 0) {
            return new ListNode(carry, head);
        }

        return head;
    }
}