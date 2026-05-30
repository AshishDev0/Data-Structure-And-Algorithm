class Solution {
    private void recursion(int last, int sum, int k, List<Integer> list, List<List<Integer>> ans) {
        if (sum == 0 && list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (sum < 0 || list.size() > k) {
            return;
        }

        for (int i = last; i <= 9; i++) {
            if (i <= sum) {
                list.add(i);
                recursion(i + 1, sum - i, k, list, ans);
                list.remove(list.size() - 1);
            } else {
                break;
            }
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();

        recursion(1, n, k, new ArrayList<>(), ans);

        return ans;
    }
}