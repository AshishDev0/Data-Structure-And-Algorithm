class Solution {
    public double minimiseMaxDistance(int[] arr, int k) {
        int[] howMany = new int[arr.length - 1];

        PriorityQueue<double[]> pq = new PriorityQueue<>(
                (a, b) -> Double.compare(b[0], a[0])
        );

        for (int i = 0; i < arr.length - 1; i++) {
            int distance = arr[i + 1] - arr[i];
            pq.add(new double[]{ distance, i });
        }

        for (int gasStation = 1; gasStation <= k; gasStation++) {
            double[] top = pq.poll();

            int maxIdx = (int) top[1];
            howMany[maxIdx]++;

            double originalDist = arr[maxIdx + 1] - arr[maxIdx];
            double newSectionLength = originalDist / (howMany[maxIdx] + 1);

            pq.add(new double[]{ newSectionLength, maxIdx });
        }

        return pq.peek()[0];
    }
}