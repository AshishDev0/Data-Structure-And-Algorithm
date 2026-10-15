class Solution {
    private boolean recursion(int idx, String s, int count) {
        if (count < 0) return false;

        if (idx == s.length()) {
            return count == 0;
        }

        char ch = s.charAt(idx);

        if (ch == '(') {
            return recursion(idx + 1, s, count + 1);
        }

        if (ch == ')') {
            return recursion(idx + 1, s, count - 1);
        }

        return recursion(idx + 1, s, count + 1)
                || recursion(idx + 1, s, count - 1)
                || recursion(idx + 1, s, count);
    }

    public boolean isValid(String s) {
        //your code goes here

        return recursion(0, s, 0);
    }
}