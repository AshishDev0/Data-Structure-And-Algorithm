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
    public ListNode insertBeforeX(ListNode head, int X, int val) {
        if (head == null) {
            return head;
        }

        if (head.data == X) {
            return new ListNode(val, head);
        }

        ListNode temp = head;
        while (temp.next != null) {
            if (temp.next.data == X) {
                ListNode newNode = new ListNode(val, temp.next);
                temp.next = newNode;
                break;
            }

            temp = temp.next;
        }

        return head;
    }
}