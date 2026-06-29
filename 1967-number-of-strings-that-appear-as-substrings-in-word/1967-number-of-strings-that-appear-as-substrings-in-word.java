class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int n=patterns.length;// if take-- 1ms  else 0ms
        int count=0;
        for(int i=0;i<n;i++){
            if(word.contains(patterns[i])){
                count++;
            }
        }
        return count; 
    }
}