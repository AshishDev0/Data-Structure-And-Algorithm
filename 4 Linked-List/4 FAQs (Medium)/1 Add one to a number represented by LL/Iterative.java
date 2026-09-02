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
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }

    public ListNode addOne(ListNode head) {
        head = reverse(head);

        ListNode temp = head;
        int carry = 1;

        while (temp != null) {
            temp.val = temp.val + carry;

            if (temp.val < 10) {
                carry = 0;
                break;
            }

            temp.val = 0;
            carry = 1;
            temp = temp.next;
        }

        if (carry > 0) {
            return new ListNode(carry, head);
        }

        head = reverse(head);

        return head;
    }
}