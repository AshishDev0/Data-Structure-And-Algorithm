/*
// Definition for a Node.
class ListNode {
    public int data;
    public ListNode prev;
    public ListNode next;
    public ListNode();
    public ListNode(int data);
    public ListNode(int data, ListNode prev, ListNode next);
};
*/

class Solution {
    public ListNode deleteKthElement(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return k == 1 ? null : head;
        }

        int count = 1;
        ListNode temp = head;
        while (temp != null) {
            if (count == k) {
                break;
            }

            count++;
            temp = temp.next;
        }

        if (temp == null) {
            return head;
        }

        ListNode prev = temp.prev;
        ListNode next = temp.next;

        if (prev == null) {
            head = next;
            temp.next = null;
            next.prev = null;
            return head;
        } else if (next == null) {
            prev.next = null;
            temp.prev = null;
            return head;
        }

        prev.next = next;
        temp.prev = null;
        next.prev = prev;
        temp.next = null;

        return head;
    }
}