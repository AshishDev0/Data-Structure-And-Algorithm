class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int product = 1;
                for (int k = i; k <= j; k++) {
                    product *= nums[k];
                }
                ans = Math.max(ans, product);
            }
        }
        return ans;
    }
}