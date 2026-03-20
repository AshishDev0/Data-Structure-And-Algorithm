class Solution {
    private int countStudents(int[] nums, int pages) {
        int studentsCount = 1;
        int allocatedPagesSum = 0;

        for (int num: nums) {
            if (num + allocatedPagesSum <= pages) {
                allocatedPagesSum += num;
            } else {
                studentsCount++;
                allocatedPagesSum = num;
            }
        }

        return studentsCount;
    }

    public int findPages(int[] nums, int m) {
        if (m > nums.length) return -1;

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num: nums) {
            max = Math.max(max, num);
            sum += num;
        }

        int ans = -1;
        int low = max;
        int high = sum;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (countStudents(nums, mid) <= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;w
            }
        }

        return ans;
    }
}