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
    private ListNode findIntersection(ListNode temp1, ListNode temp2, int d) {
        while (d > 0) {
            d--;
            temp2 = temp2.next;
        }

        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1 = 0;
        ListNode temp = headA;
        while (temp != null) {
            n1++;
            temp = temp.next;
        }

        int n2 = 0;
        temp = headB;
        while (temp != null) {
            n2++;
            temp = temp.next;
        }

        if (n1 < n2) {
            return findIntersection(headA, headB, n2 - n1);
        } else {
            return findIntersection(headB, headA, n1 - n2);
        }
    }
}