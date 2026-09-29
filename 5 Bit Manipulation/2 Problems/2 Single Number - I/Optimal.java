class Solution {
    public int singleNumber(int[] nums) {
        //your code goes here

        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
}