class Solution {
    private void helper(int idx, StringBuilder sb, List<String> ans, String[] map, String digits) {
        if (idx == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        String str = map[digits.charAt(idx) - '0'];

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            helper(idx + 1, sb, ans, map, digits);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        String[] map = new String[]{
                "", "", "abc", "def",
                "ghi", "jkl", "mno",
                "pqrs", "tuv", "wxyz"
        };

        helper(0, new StringBuilder(), ans, map, digits);

        return ans;
    }
}