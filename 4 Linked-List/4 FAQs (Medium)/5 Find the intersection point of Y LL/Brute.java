/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode temp = headA;

        while (temp != null) {
            set.add(temp);
            temp = temp.next;
        }

        temp = headB;
        while (temp != null) {
            if (set.contains(temp)) {
                return temp;
            }

            temp = temp.next;
        }

        return null;
    }
}