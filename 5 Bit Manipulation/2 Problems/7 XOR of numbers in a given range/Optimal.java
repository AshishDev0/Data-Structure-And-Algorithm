class Solution {
    private int xorTillN(int n) {
        if (n % 4 == 1) return 1;
        else if (n % 4 == 2) return n + 1;
        else if (n % 4 == 3) return 0;

        return n;
    }

    public int findRangeXOR(int l, int r) {
        //your code goes here

        return xorTillN(l - 1) ^ xorTillN(r);
    }
}