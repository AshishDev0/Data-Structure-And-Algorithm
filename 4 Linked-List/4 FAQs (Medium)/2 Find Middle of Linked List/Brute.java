
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
    public ListNode middleOfLinkedList(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int middleCount = count / 2 + 1;
        temp = head;
        while (temp != null) {
            middleCount--;
            if (middleCount == 0) break;
            temp = temp.next;
        }

        return temp;
    }
}
