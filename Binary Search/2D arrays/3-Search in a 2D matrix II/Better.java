class Solution {
    private boolean binarySearch(int[] row, int target) {
        int low = 0;
        int high = row.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (row[mid] == target) return true;

            if (row[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;

        for (int i = 0; i < m; i++) {
            boolean flag = binarySearch(matrix[i], target);

            if (flag) return true;
        }

        return false;
    }
}