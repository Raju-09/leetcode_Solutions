/*class Solution {
    public int reverse(int x) {
        int a=Math.abs(x);
        int limit = Integer.MAX_VALUE/10;
        int sum=0;  
       while(a>0) {
           if(sum>limit)  return 0;
            sum=sum*10+a%10;
            a=a/10;
       }
        if(x<0) return (sum*-1);
        return sum; 
    }
}
*/

class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int digit = x % 10;
            x = x / 10;
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                return 0;
            }
            rev = rev * 10 + digit;
        }
        return rev;
    }
}