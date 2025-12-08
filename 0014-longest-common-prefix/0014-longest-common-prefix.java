class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Start with the first string as the candidate prefix
        String prefix = strs[0];

        // Compare with each other string
        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];

            // Shrink prefix until s starts with it
            while (!s.startsWith(prefix)) {
                // Drop the last character
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}