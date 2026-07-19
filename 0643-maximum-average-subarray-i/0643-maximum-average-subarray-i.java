class Solution {
    public double findMaxAverage(int[] nums, int k){
      /*  int windowsum=0;
        for(int i=0;i<k;i++){
            windowsum += nums[i];
        }
        int maxsum=windowsum;
        for(int i=k;i<nums.length;i++){
            windowsum = windowsum-nums[i-k]+nums[i];
            maxsum=Math.max(maxsum,windowsum);
        }
        return (double)maxsum/k;*/

        int n=nums.length;
        double maxAvg=Double.NEGATIVE_INFINITY;
        for(int i=0;i<=n-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum+=nums[j];
            }
            maxAvg=Math.max(maxAvg,(double)sum/k);
        }
        return maxAvg;
        
    }
}
