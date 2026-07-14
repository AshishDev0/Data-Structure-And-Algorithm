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
    public ListNode insertAtKthPosition(ListNode head, int X, int K) {
        if (head == null) {
            if (K == 1) {
                return new ListNode(X);
            } else {
                return head;
            }
        }

        if (K == 1) {
            return new ListNode(X, head);
        }

        int count = 1;
        ListNode temp = head;
        while (temp != null) {
            if (count == K - 1) {
                ListNode newNode = new ListNode(X, temp.next);
                temp.next = newNode;
                break;
            }

            count++;
            temp = temp.next;
        }

        return head;
    }
}