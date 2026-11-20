class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int val = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) res[top][j] = val++;
            top++;
            for (int i = top; i <= bottom; i++) res[i][right] = val++;
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) res[bottom][j] = val++;
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) res[i][left] = val++;
                left++;
            }
        }
        return res;
    }
}
