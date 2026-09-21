/*Definition for singly Linked List
class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode next2) {
        val = data1;
        next = next1;
        child = next2;
    }
}
*/
class Solution {
    public ListNode flattenLinkedList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode t1 = flattenLinkedList(head.next);
        ListNode t2 = head;

        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                temp.child = t1;
                t1 = t1.child;
            } else {
                temp.child = t2;
                t2 = t2.child;
            }
            temp.next = null;
            temp = temp.child;
        }

        if (t1 != null) temp.child = t1;
        if (t2 != null) temp.child = t2;

        return dummyNode.child;
    }
}