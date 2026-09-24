/*
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
*/

class Solution {
    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
        // Your code goes here

        if (head == null || head.next == null) {
            return new ArrayList<>();
        }

        ListNode left = head;
        ListNode right = head;

        while (right.next != null) {
            right = right.next;
        }

        List<List<Integer>> list = new ArrayList<>();

        while (left != right && left.prev != right) {
            int sum = left.val + right.val;

            if (sum == target) {
                list.add(List.of(left.val, right.val));
                left = left.next;
                right = right.prev;
            } else if (sum < target) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }

        return list;
    }
}