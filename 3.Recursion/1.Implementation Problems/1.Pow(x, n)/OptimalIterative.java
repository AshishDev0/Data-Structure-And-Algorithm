class Solution {
    public double myPow(double x, int n) {
        if (x == 1 || n == 0) {
            return 1;
        }

        long temp = n;

        if (n < 0) {
            x = 1 / x;
            temp = -temp;
        }

        double ans = 1;

        while (temp > 0) {
            if (temp % 2 == 1) {
                ans *= x;
                temp -= 1;
            } else {
                x *= x;
                temp /= 2;
            }
        }

        return ans;
    }
}