/*class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] freq = new int[3];
        int left = 0;
        int result = 0;
        
        for (int right = 0; right < n; right++) {
            freq[s.charAt(right) - 'a']++;
            
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                result += n - right;  
                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return result;
    }
}

*/

class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq = new int[3];

        int left = 0, right = 0;
        int distinct = 0;
        int count = 0;

        while(right < s.length()){
            int c = s.charAt(right) - 'a';

            if(freq[c] == 0)
                distinct++;
            freq[c]++;

            while(distinct == 3){
                count += (s.length() - right);

                int leftChar = s.charAt(left) - 'a';
                freq[leftChar]--;
                if(freq[leftChar] == 0)
                    distinct--;
                left++;
            }

            right++;
        }

        return count;
    }
}