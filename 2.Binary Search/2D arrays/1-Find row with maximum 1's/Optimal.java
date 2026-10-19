class Solution {
    public int rowWithMax1s(int[][] mat) {
        int ans = -1;
        int i = 0;
        int j = mat[0].length - 1;

        while (i < mat.length && j >= 0) {
            if (mat[i][j] == 1) {
                ans = i;
                j--;
            } else {
                i++;
            }
        }

        return ans;
    }
}