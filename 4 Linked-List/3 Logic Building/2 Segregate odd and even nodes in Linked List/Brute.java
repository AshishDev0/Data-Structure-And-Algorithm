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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        List<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null && temp.next != null) {
            list.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null) {
            list.add(temp.data);
        }

        temp = head.next;
        while (temp != null && temp.next != null) {
            list.add(temp.data);
            temp = temp.next.next;
        }
        if (temp != null) {
            list.add(temp.data);
        }

        int i = 0;
        temp = head;
        while (temp != null) {
            temp.data = list.get(i);
            temp = temp.next;
            i++;
        }


        return head;
    }
}