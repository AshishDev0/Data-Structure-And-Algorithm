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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> arr = new ArrayList<>();
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null) {
            arr.add(temp1.val);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            arr.add(temp2.val);
            temp2 = temp2.next;
        }

        Collections.sort(arr);

        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        for (int val : arr) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        return dummyNode.next;
    }
}