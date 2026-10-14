class Solution {
    public int findPlatform(int[] Arrival, int[] Departure) {
        //your code goes here

        Arrays.sort(Arrival);
        Arrays.sort(Departure);

        int i = 0;
        int j = 0;

        int count = 0;
        int maxCount = 0;

        while (i < Arrival.length) {
            if (Arrival[i] <= Departure[j]) {
                count++;
                i++;
            } else {
                count--;
                j++;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}