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
    public ListNode sortList(ListNode head) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        ListNode temp = head;

        while (temp != null) {
            if (temp.data == 0) {
                count0++;
            } else if (temp.data == 1) {
                count1++;
            } else {
                count2++;
            }

            temp = temp.next;
        }

        temp = head;

        while(count0 > 0) {
            temp.data = 0;
            count0--;
            temp = temp.next;
        }
        while(count1 > 0) {
            temp.data = 1;
            count1--;
            temp = temp.next;
        }
        while (count2 > 0) {
            temp.data = 2;
            count2--;
            temp = temp.next;
        }

        return head;
    }
}