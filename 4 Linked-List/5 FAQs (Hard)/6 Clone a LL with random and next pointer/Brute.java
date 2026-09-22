/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;
    ListNode random;

    ListNode() {
        val = 0;
        next = null;
        random = null;
    }

    ListNode(int val) {
        this.val = val;
        next = null;
        random = null;
    }

    ListNode(int val, ListNode next, ListNode random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }
}
 */

class Solution {
    public ListNode copyRandomList(ListNode head) {
        ListNode temp = head;
        Map<ListNode, ListNode> map = new HashMap<>();

        while (temp != null) {
            ListNode node = new ListNode(temp.val);
            map.put(temp, node);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            ListNode node = map.get(temp);
            node.next = map.get(temp.next);
            node.random = map.get(temp.random);
            temp = temp.next;
        }

        return map.get(head);
    }
}
