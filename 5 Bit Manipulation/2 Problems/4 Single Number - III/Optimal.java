class Solution {
    public int[] singleNumber(int[] nums) {
        //your code goes here

        long xorr = 0;
        for (int num : nums) {
            xorr ^= num;
        }

        int rightMost = (int)(xorr & (xorr - 1)) ^ (int)xorr;

        int xorr1 = 0;
        int xorr2 = 0;
        for (int num : nums) {
            if ((num & rightMost) != 0) {
                xorr1 ^= num;
            } else {
                xorr2 ^= num;
            }
        }

        if (xorr1 < xorr2) {
            return new int[]{ xorr1, xorr2 };
        }

        return new int[]{ xorr2, xorr1 };
    }
}