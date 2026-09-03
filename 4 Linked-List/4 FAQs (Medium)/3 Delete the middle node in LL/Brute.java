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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;

        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            n++;
        }

        int middleIndex = n / 2;
        temp = head;
        while (temp != null) {
            middleIndex--;
            if (middleIndex == 0) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }

        return head;
    }
}