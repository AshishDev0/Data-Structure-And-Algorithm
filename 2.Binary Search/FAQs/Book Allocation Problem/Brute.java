class Solution {
    private int countStudents(int[] nums, int pages) {
        int studentsCount = 1;
        int allocatedPages = 0;

        for (int num: nums) {
            if (num + allocatedPages <= pages) {
                allocatedPages += num;
            } else {
                studentsCount++;
                allocatedPages = num;
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

        int low = max;
        int high = sum;

        for (int pages = low; pages <= high; pages++) {
            if (countStudents(nums, pages) <= m) {
                return pages;
            }
        }

        return low;
    }
}