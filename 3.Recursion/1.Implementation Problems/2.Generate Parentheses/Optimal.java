class Solution {
    private void generate(String s, int open, int close, List<String> ans, int n) {
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }

        if (open < n) {
            generate(s + "(", open + 1, close, ans, n);
        }

        if (close < open) {
            generate(s + ")", open, close + 1, ans, n);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        generate("", 0, 0, ans, n);

        return ans;
    }
}