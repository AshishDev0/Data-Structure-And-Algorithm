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
    public int findLengthOfLoop(ListNode head) {
        Map<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            if (map.containsKey(temp)) {
                return count - map.get(temp);
            }

            map.put(temp, count);
            count++;
            temp = temp.next;
        }

        return 0;
    }
}