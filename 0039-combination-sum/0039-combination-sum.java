import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] candidates, int remain, int start, List<Integer> current, List<List<Integer>> res) {
        if (remain == 0) {
            res.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remain) break;
            current.add(candidates[i]);
            backtrack(candidates, remain - candidates[i], i, current, res);
            current.deleteCharAt(current.size() - 1);
        }
    }
}
