class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        int n=nums.length;
        int dp[]=new int[n-1];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<dp.length;i++){
            int rob=dp[i-2]+nums[i];
            int notrob=dp[i-1];
        dp[i]=Math.max(rob,notrob);
        }
        int a=dp[dp.length-1];
        dp=new int[nums.length-1];
        dp[0]=nums[1];
        dp[1]=Math.max(nums[1],nums[2]);
        for(int i=2;i<dp.length;i++){
            int rob=dp[i-2]+nums[i+1];
            int notrob=dp[i-1];
            dp[i]=Math.max(rob,notrob);
        }
        int b=dp[dp.length-1];
        return Math.max(a,b);
    }
}