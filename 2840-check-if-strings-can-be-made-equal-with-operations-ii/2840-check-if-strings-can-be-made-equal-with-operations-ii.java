/*import java.util.*;

class Solution {
    public boolean checkStrings(String s1, String s2) {

        List<Character> e1 = new ArrayList<>();
        List<Character> o1 = new ArrayList<>();
        List<Character> e2 = new ArrayList<>();
        List<Character> o2 = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                e1.add(s1.charAt(i));
                e2.add(s2.charAt(i));
            } else {
                o1.add(s1.charAt(i));
                o2.add(s2.charAt(i));
            }
        }

        Collections.sort(e1);
        Collections.sort(e2);
        Collections.sort(o1);
        Collections.sort(o2);

        return e1.equals(e2) && o1.equals(o2);
    }
}*/

class Solution {
    public boolean checkStrings(String s1, String s2) {

        int[] even = new int[26];
        int[] odd = new int[26];

        for (int i = 0; i < s1.length(); i++) {

            if (i % 2 == 0) {
                even[s1.charAt(i) - 'a']++;
                even[s2.charAt(i) - 'a']--;
            } else {
                odd[s1.charAt(i) - 'a']++;
                odd[s2.charAt(i) - 'a']--;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (even[i] != 0 || odd[i] != 0) {
                return false;
            }
        }

        return true;
    }
}