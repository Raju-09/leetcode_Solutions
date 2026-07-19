class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        /*boolean[] used=new boolean[s.length];

        int content=0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<s.length;j++){
                if(!used[j] && s[j]>=g[i]){
                    used[j]=true;
                    content++;
                    break;
                    
                }
            }
        }
        return content;*/

        int childIndex=0;
        int cookieIndex=0;
        while(childIndex<g.length && cookieIndex<s.length){
            if(s[cookieIndex]>=g[childIndex]){
                childIndex++;
        }
        cookieIndex++;
        }
        return childIndex;
    }
}