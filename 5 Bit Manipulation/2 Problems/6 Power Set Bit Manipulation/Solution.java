class Solution {
    public List<List<Integer>> powerSet(int[] nums) {
        //your code goes here

        List<List<Integer>> ans = new ArrayList<>();
        int subsets = 1 << (nums.length);

        for (int n = 0; n < subsets; n++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if ((n & (1 << i)) != 0) {
                    list.add(nums[i]);
                }
            }
            ans.add(list);
        }

        return ans;
    }
}