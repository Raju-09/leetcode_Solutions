class Solution {
    public double myPow(double x, int n) {
       /*return (double)Math.pow(x,n);*/

       long pow=n;
       if(pow<0){
        x=1/x;
        pow=-pow;
       }
       return helper(x,pow);
    }

    public double helper(double x,long n){
        if(n==0) return 1.0;
        double half=helper(x,n/2);

        if(n%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
    }
}