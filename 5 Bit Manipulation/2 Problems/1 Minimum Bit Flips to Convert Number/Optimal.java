class Solution {
    private int countSetBit(int n) {
        int count = 0;

        while (n > 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }

    public int minBitsFlip(int start, int goal) {
        //your code goes here

        int ans = start ^ goal;

        return countSetBit(ans);
    }
}