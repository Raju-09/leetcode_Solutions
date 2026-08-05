class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
      //  Arrays.sort(nums);
        for(int num=0;num<n;num++){
            if(num>=0){
            ans[num]=nums[num]*nums[num];
            }else{
                ans[num]=0;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}