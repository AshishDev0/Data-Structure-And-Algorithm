class Solution {
    private void backTrack(StringBuilder sb, int i, int j, List<String> ans, int[][] grid) {
        int n = grid.length;

        if (i == n - 1 && j == n - 1) {
            ans.add(sb.toString());
            return;
        }

        grid[i][j] = 0;

        if (i - 1 >= 0 && grid[i - 1][j] != 0) {
            sb.append("U");
            backTrack(sb, i - 1, j, ans, grid);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (j + 1 < n && grid[i][j + 1] != 0) {
            sb.append("R");
            backTrack(sb, i, j + 1, ans, grid);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (i + 1 < n && grid[i + 1][j] != 0) {
            sb.append("D");
            backTrack(sb, i + 1, j, ans, grid);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (j - 1 >= 0 && grid[i][j - 1] != 0) {
            sb.append("L");
            backTrack(sb, i, j - 1, ans, grid);
            sb.deleteCharAt(sb.length() - 1);
        }

        grid[i][j] = 1;
    }

    public List<String> findPath(int[][] grid) {
        List<String> ans = new ArrayList<>();
        int n = grid.length;

        if (grid[0][0] == 0 || grid[n - 1][n - 1] == 0) {
            return ans;
        }

        backTrack(new StringBuilder(), 0, 0, ans, grid);

        return ans;
    }
}