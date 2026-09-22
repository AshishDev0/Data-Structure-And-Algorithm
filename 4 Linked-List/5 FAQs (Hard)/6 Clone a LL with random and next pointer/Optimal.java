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
    private void insertNodeInBetween(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            ListNode node = new ListNode(temp.val);
            node.next = temp.next;
            temp.next = node;
            temp = temp.next.next;
        }
    }

    private void connectRandomPointers(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            ListNode node = temp.next;

            if (temp.random != null) {
                node.random = temp.random.next;
            }

            temp = temp.next.next;
        }
    }

    private ListNode getDeepCopy(ListNode head) {
        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;
        ListNode temp = head;

        while (temp != null) {
            current.next = temp.next;
            temp.next = temp.next.next;
            current = current.next;
            temp = temp.next;
        }

        return dummyNode.next;
    }

    public ListNode copyRandomList(ListNode head) {
        if (head == null) return head;

        insertNodeInBetween(head);
        connectRandomPointers(head);
        return getDeepCopy(head);
    }
}
