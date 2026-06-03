/*class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int os=(n*(n+1))/2;
        int miss=os-sum;
        return miss;
    }
}*/

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=i){
            ans=i;
            break;
           }
           else{
            ans=nums.length;
           }
        }
        return ans;
    }
}