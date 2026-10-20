class Solution {
    public int maxScore(int[] cardScore, int k) {
        //your code goes here

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < k; i++) {
            leftSum += cardScore[i];
        }

        int ans = leftSum;
        int rightIdx = cardScore.length - 1;
        for (int i = k - 1; i >= 0; i--) {
            leftSum -= cardScore[i];
            rightSum += cardScore[rightIdx--];
            ans = Math.max(ans, leftSum + rightSum);
        }

        return ans;
    }
}