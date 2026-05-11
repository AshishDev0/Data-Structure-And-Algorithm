class Solution {
    private double recursive(double x, long temp) {
        if (temp == 0) {
            return 1;
        }

        if (temp % 2 == 0) {
            return recursive(x * x, temp / 2);
        }

        return x * recursive(x, temp - 1);
    }

    public double myPow(double x, int n) {
        if (x == 1 || n == 0) {
            return 1;
        }

        long temp = n;

        if (n < 0) {
            x = 1 / x;
            temp = -temp;
        }

        return recursive(x, temp);
    }
}