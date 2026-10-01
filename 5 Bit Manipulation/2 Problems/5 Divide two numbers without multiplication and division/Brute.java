class Solution {
    public int divide(int dividend, int divisor) {
        //your code goes here

        if (dividend == divisor) return 1;

        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        if (divisor == 1) return dividend;

        boolean isPositive = !((dividend >= 0 && divisor < 0) || (dividend < 0 && divisor > 0));

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long ans = 0;

        while (n >= d) {
            n -= d;
            ans++;
        }

        if (ans > Integer.MAX_VALUE) {
            return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return isPositive ? (int) ans : (int) -ans;
    }
}