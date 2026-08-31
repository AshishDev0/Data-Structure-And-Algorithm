
/*Definition for Singly Linked List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            temp = temp.next;
            count++;
        }

        if (count == n) {
            return head.next;
        }

        temp = head;
        int remaining = count - n;

        while (temp != null) {
            remaining--;

            if (remaining == 0) {
                break;
            }

            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}