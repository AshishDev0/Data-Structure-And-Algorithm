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
        List<Integer> arr = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            arr.add(temp.val);
            ListNode child = temp.child;

            while (child != null) {
                arr.add(child.val);
                child = child.child;
            }

            temp = temp.next;
        }

        Collections.sort(arr);

        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;

        for (int val : arr) {
            current.child = new ListNode(val);
            current = current.child;
        }

        return dummyNode.child;
    }
}