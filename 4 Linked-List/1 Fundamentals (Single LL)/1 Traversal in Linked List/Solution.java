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
    public List<Integer> LLTraversal(ListNode head) {
        List<Integer> ans = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            ans.add(temp.data);
            temp = temp.next;
        }

        return ans;
    }
}