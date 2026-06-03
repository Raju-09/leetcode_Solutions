/*class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev=0;
        while(x>0){
            rev=(rev*10)+(x%10);
            x/=10;
        }

        return rev==x;
    }
}*/



class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int xcopy = x;

        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }

        return reverse == xcopy;        
    }
}