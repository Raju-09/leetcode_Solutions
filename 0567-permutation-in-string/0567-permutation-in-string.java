class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();

        if(m>n) return false;
        int[] a=new int[26];
        int[] b=new int[26];

        for(int i=0;i<m;i++){
            a[s1.charAt(i)-'a']++;
            b[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(a,b)) return true;

        for(int i=m;i<n;i++){
            b[s2.charAt(i)-'a']++;
            b[s2.charAt(i-m)-'a']--;

            if(Arrays.equals(a,b)) return true;
        }
        return false;

    }
}