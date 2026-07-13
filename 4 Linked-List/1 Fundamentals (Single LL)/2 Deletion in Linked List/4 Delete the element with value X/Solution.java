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
    public ListNode deleteNodeWithValueX(ListNode head, int X) {
        if (head == null) {
            return null;
        }

        if (head.data == X) {
            return head.next;
        }

        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {
            if (temp.data == X) {
                prev.next = temp.next;
                break;
            }

            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}