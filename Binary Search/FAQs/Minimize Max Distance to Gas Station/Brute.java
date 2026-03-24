class Solution {
    public double minimiseMaxDistance(int[] arr, int k) {
        int[] howMany = new int[arr.length - 1];

        for (int gasStations = 1; gasStations <= k; gasStations++) {
            double maxSectionLength = -1;
            int maxIndex = -1;

            for (int i = 0; i < arr.length - 1; i++) {
                int diff = arr[i + 1] - arr[i];
                double sectionLength = (double) diff / (howMany[i] + 1);

                if (sectionLength > maxSectionLength) {
                    maxSectionLength = sectionLength;
                    maxIndex = i;
                }
            }

            howMany[maxIndex]++;
        }

        double ans = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            double sectionLength = (double) diff / (howMany[i] + 1);
            ans = Math.max(ans, sectionLength);
        }

        return ans;
    }
}