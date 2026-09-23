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
    public ListNode removeDuplicates(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            ListNode nextNode = temp.next;

            while (nextNode != null && nextNode.val == temp.val) {
                nextNode = nextNode.next;
            }

            temp.next = nextNode;
            if (nextNode != null) {
                nextNode.prev = temp;
            }

            temp = temp.next;
        }

        return head;
    }
}