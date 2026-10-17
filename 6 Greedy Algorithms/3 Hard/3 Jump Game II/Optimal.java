class Solution {
    int jump(int[] nums) {
        // Your code goes here

        int jumps = 0;
        int farthest = 0;
        int currentEnd = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }

        return jumps;
    }
}