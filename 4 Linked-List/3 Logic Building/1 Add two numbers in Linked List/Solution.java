/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode temp = dummyHead;

        ListNode t1 = l1;
        ListNode t2 = l2;
        int carry = 0;

        while (t1 != null || t2 != null) {
            int sum = carry;

            if (t1 != null) {
                sum += t1.data;
                t1 = t1.next;
            }

            if (t2 != null) {
                sum += t2.data;
                t2 = t2.next;
            }

            ListNode node = new ListNode(sum % 10);
            temp.next = node;
            temp = temp.next;
            carry = sum / 10;
        }

        if (carry > 0) {
            ListNode node = new ListNode(carry);
            temp.next = node;
            temp = temp.next;
        }

        return dummyHead.next;
    }
}