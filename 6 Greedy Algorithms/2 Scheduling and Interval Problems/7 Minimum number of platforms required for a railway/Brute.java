class Solution {
    public int findPlatform(int[] Arrival, int[] Departure) {
        //your code goes here

        int ans = 1;

        for (int i = 0; i < Arrival.length; i++) {
            int count = 1;

            for (int j = 0; j < Arrival.length; j++) {
                if (i == j) continue;

                if (Arrival[i] >= Arrival[j] && Departure[j] >= Arrival[i]) {
                    count++;
                }
            }

            ans = Math.max(ans, count);
        }

        return ans;
    }
}