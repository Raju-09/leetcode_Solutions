class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        int m=s.length();
        int n=p.length();

        if(n>m) return res; 

        int[] a=new int[26];
        int[] b=new int[26];

        for(int i=0;i<n;i++){
            a[s.charAt(i)-'a']++;
            b[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(a,b)) res.add(0);

        for(int i=n;i<m;i++){
            a[s.charAt(i)-'a']++;
            a[s.charAt(i-n)-'a']--;
            if(Arrays.equals(a,b)) res.add(i-n+1);
        }
        return res;
    }
}