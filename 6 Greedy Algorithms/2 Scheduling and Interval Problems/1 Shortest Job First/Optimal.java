class Solution {
    public long solve(int[] bt) {
        //your code goes here

        Arrays.sort(bt);

        long waitTime = 0;
        long totalTime = 0;

        for (int num : bt) {
            waitTime += totalTime;
            totalTime += num;
        }

        return waitTime / bt.length;
    }
}