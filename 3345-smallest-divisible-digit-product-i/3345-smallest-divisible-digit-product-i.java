class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
        int dig=1;
        int x=n;
        while(x>0){
            dig *= x %10;
            x/=10;

        }
        if(dig %t==0){
            return n;

        }
        n++;
        }
    }
}