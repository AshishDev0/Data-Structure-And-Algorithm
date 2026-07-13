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
    public ListNode deleteKthNode(ListNode head, int k) {
        if (head == null) {
            return head;
        }

        if (k == 1) {
            return head.next;
        }

        int count = 1;
        ListNode prev = null;
        ListNode temp = head;

        while (temp != null) {
            if (count == k) {
                prev.next = temp.next;
                break;
            }

            count++;
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}