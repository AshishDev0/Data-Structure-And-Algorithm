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
    public void deleteGivenNode(ListNode node) {
        ListNode prev = node.prev;
        ListNode next = node.next;

        if (prev == null) {
            node.next = null;
            next.prev = null;
            return;
        } else if (next == null) {
            prev.next = null;
            node.prev = null;
            return;
        }

        prev.next = next;
        next.prev = prev;

        node.next = null;
        node.prev = null;
    }
}