class Solution {
    private int countNoOfSubArrays(int[] a, int totalSum) {
        int count = 1;
        int sum = 0;

        for (int num: a) {
            if (sum + num <= totalSum) {
                sum += num;
            } else {
                count++;
                sum = num;
            }
        }

        return count;
    }

    public int largestSubarraySumMinimized(int[] a, int k) {
        if (a.length < k) return -1;

        int low = Integer.MIN_VALUE;
        int high = 0;
        for (int num: a) {
            low = Math.max(low, num);
            high += num;
        }

        for (int i = low; i <= high; i++) {
            int count = countNoOfSubArrays(a, i);
            if (count <= k) return i;
        }

        return -1;
    }
}