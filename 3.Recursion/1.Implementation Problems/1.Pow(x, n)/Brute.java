class Solution {
    public double myPow(double x, int n) {
        //your code goes here

        if (n == 0 || x == 1) return 1;

        if (n < 0) {
            x = 1 / x;
            n = -1 * n;
        }

        double ans = 1;

        for (int i = 0; i < n; i++)
            ans *= x;

        return ans;
    }
}