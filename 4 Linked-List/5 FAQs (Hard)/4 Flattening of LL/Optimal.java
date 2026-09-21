/*Definition for singly Linked List
class ListNode {
    int val;
    ListNode next;
    ListNode child;

    ListNode() {
        val = 0;
        next = null;
        child = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
        child = null;
    }

    ListNode(int data1, ListNode next1, ListNode next2) {
        val = data1;
        next = next1;
        child = next2;
    }
}
*/
class Solution {
    public ListNode flattenLinkedList(ListNode head) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.val, b.val)
        );

        ListNode temp = head;
        while (temp != null) {
            pq.offer(temp);
            temp = temp.next;
        }

        ListNode dummyNode = new ListNode(-1);
        temp = dummyNode;

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            temp.child = node;
            temp = temp.child;
            node.next = null;

            if (node.child != null) {
                pq.offer(node.child);
            }
        }

        return dummyNode.child;
    }
}