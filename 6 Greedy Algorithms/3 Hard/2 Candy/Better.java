class Solution {
    public int candy(int[] ratings) {
        //your code goes here

        int[] left = new int[ratings.length];
        Arrays.fill(left, 1);

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }

        int curr = 1;
        int right = 1;
        int sum = Math.max(1, left[ratings.length - 1]);

        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                curr = right + 1;
            } else {
                curr = 1;
            }
            right = curr;
            sum += Math.max(left[i], curr);
        }

        return sum;
    }
}