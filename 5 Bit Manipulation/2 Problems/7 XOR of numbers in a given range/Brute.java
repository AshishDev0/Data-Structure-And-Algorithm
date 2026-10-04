class Solution {
    public int findRangeXOR(int l, int r) {
        //your code goes here

        int xor = 0;
        for (int n = l; n <= r; n++) {
            xor ^= n;
        }

        return xor;
    }
}