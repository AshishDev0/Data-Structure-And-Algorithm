class Solution {
    private int numberOfGasStationsRequired(int[] arr, double dist) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int numberInBetween = (int) ((arr[i + 1] - arr[i]) / dist);

            if ((arr[i + 1] - arr[i]) == (dist * numberInBetween)) {
                numberInBetween--;
            }

            count += numberInBetween;
        }

        return count;
    }

    public double minimiseMaxDistance(int[] arr, int k) {
        double low = 0;
        double high = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            high = Math.max(high, arr[i + 1] - arr[i]);
        }

        double ans = high;
        double diff = 1e-6;

        while (high - low > diff) {
            double mid = (low + high) / 2.0;
            int count = numberOfGasStationsRequired(arr, mid);

            if (count > k) {
                low = mid;
            } else {
                ans = mid;
                high = mid;
            }
        }

        return ans;
    }
}