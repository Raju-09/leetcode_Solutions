import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');
        boolean[] cols = new boolean[n];
        boolean[] d1 = new boolean[2 * n];
        boolean[] d2 = new boolean[2 * n];
        backtrack(0, board, res, cols, d1, d2, n);
        return res;
    }

    private void backtrack(int r, char[][] board, List<List<String>> res, boolean[] cols, boolean[] d1, boolean[] d2, int n) {
        if (r == n) {
            List<String> list = new ArrayList<>();
            for (char[] row : board) list.add(new String(row));
            res.add(list);
            return;
        }
        for (int c = 0; c < n; c++) {
            int id1 = r - c + n;
            int id2 = r + c;
            if (cols[c] || d1[id1] || d2[id2]) continue;
            board[r][c] = 'Q';
            cols[c] = d1[id1] = d2[id2] = true;
            backtrack(r + 1, board, res, cols, d1, d2, n);
            board[r][c] = '.';
            cols[c] = d1[id1] = d2[id2] = false;
        }
    }
}
