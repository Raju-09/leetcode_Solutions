class Solution {
    public int maxProduct(int n) {
        int lar=Integer.MIN_VALUE;
        int seclar=Integer.MIN_VALUE;

        while(n>0){
            int digit=n%10;
            if(digit>lar){
                seclar=lar;
                lar=digit;
            }else if(digit>=seclar){
                seclar=digit;
            }
            n/=10;
        }
        return lar*seclar;
    }
}