class Solution {
    private int upperBound(int[] row, int target, int m) {
        int low = 0;
        int high = m - 1;
        int ans = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (row[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private int findSmallerEqual(int[][] matrix, int target, int n, int m) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += upperBound(matrix[i], target, m);
        }

        return count;
    }

    public int findMedian(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][m - 1]);
        }

        int required = (m * n) / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int smallerEqualCount = findSmallerEqual(matrix, mid, n, m);

            if (smallerEqualCount <= required) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}