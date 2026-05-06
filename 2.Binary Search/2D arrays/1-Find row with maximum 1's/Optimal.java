class Solution {
    private int countOne(int[] row) {
        int low = 0;
        int high = row.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (row[mid] == 1)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return row.length - low;
    }

    public int rowWithMax1s(int[][] mat) {
        int idx = -1;
        int maxCount = 0;

        for (int i = 0; i < mat.length; i++) {
            int count = countOne(mat[i]);

            if (count > maxCount) {
                maxCount = count;
                idx = i;
            }
        }

        return idx;
    }
}