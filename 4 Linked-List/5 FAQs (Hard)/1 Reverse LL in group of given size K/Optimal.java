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
        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        return prev;
    }

    private ListNode getKthNode(ListNode head, int k) {
        ListNode temp = head;
        k--;

        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }

        return temp;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevLast = null;

        while (temp != null) {
            ListNode kthNode = getKthNode(temp, k);

            if (kthNode == null) {
                if (prevLast != null) prevLast.next = temp;
                break;
            }

            ListNode next = kthNode.next;
            kthNode.next = null;

            reverse(temp);

            if (temp == head) {
                head = kthNode;
            } else {
                prevLast.next = kthNode;
            }

            prevLast = temp;
            temp = next;
        }

        return head;
    }
}