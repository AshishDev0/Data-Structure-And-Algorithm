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

        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (countNoOfSubAwrrays(a, mid) <= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return ans;
    }
}