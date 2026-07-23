class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int diff=total+target;
        if(diff%2!=0||diff< 0){
            return 0;
        }
        int tar=diff/2;
        int dp[]=new int[tar+1];
        dp[0]=1;
        for(int num: nums){
            for(int j=tar;j>=num;j--){
                dp[j]+=dp[j-num];
            }
        }
        return dp[tar];
    }
}