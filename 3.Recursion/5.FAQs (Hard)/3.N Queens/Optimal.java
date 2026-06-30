class Solution {
    private boolean isSafe(int row, int col, List<String> board) {
        int r = row;
        int c = col;

        while (r >= 0 && c >= 0) {
            if (board.get(r).charAt(c) == 'Q') {
                return false;
            }
            r--;
            c--;
        }

        r = row;
        c = col;
        while (r >= 0) {
            if (board.get(r).charAt(c) == 'Q') {
                return false;
            }
            r--;
        }

        r = row;
        c = col;
        while (r >= 0 && c < board.get(0).length()) {
            if (board.get(r).charAt(c) == 'Q') {
                return false;
            }

            r--;
            c++;
        }

        return true;
    }

    private void backTrack(int row, List<String> board, List<List<String>> ans) {
        if (row == board.size()) {
            ans.add(new ArrayList<>(board));
            return;
        }

        for (int col = 0; col < board.get(0).length(); col++) {
            if (isSafe(row, col, board)) {
                char[] rowArr = board.get(row).toCharArray();

                rowArr[col] = 'Q';
                board.set(row, new String(rowArr));

                backTrack(row + 1, board, ans);

                rowArr[col] = '.';
                board.set(row, new String(rowArr));
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            board.add(".".repeat(n));
        }

        backTrack(0, board, ans);

        return ans;
    }
}