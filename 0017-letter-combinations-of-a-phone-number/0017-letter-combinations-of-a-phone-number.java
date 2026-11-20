import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res;
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(digits, 0, new StringBuilder(), res, map);
        return res;
    }

    private void backtrack(String digits, int idx, StringBuilder current, List<String> res, String[] map) {
        if (idx == digits.length()) {
            res.add(current.toString());
            return;
        }
        String letters = map[digits.charAt(idx) - '0'];
        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(digits, idx + 1, current, res, map);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
