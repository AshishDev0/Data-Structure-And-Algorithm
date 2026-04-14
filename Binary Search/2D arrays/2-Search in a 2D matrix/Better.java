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

    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++) {
            if (mat[i][0] <= target && target <= mat[i][m - 1]) {
                return binarySearch(mat[i], target);
            }
        }

        return false;
    }
}