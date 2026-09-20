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
    private ListNode getKthNode(ListNode head, int k) {
        ListNode temp = head;

        while (temp != null) {
            k--;

            if (k == 0) {
                return temp;
            }

            temp = temp.next;
        }

        return temp;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int length = 1;
        ListNode lastNode = head;

        while (lastNode.next != null) {
            length++;
            lastNode = lastNode.next;
        }

        if (k % length == 0) return head;
        k = k % length;

        lastNode.next = head;

        ListNode kthNode = getKthNode(head, length - k);

        head = kthNode.next;
        kthNode.next = null;

        return head;
    }
}