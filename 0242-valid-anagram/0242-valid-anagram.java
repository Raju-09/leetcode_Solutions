import java.util.*;
/*class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }
}
*/

/*
import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}*/


class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length()!=s.length()){
            return false;
        }
        int[] arr=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']+=1;
        }
        for(char ch:t.toCharArray()){
            arr[ch-'a']-=1;
        }
        for(int i:arr){
            if(i!=0){
                return false;
            }
        }
        return true;

    }
}