class Solution {
    public int removeElement(int[] nums, int val) {   
        int n=nums.length;
      /*  int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;


            }
        }
        return count;*/
        int left=0;
        for(int right=0;right<n;right++){
            if(nums[right]!=val){
                nums[left]=nums[right];
                left++;
            }
        }
        return left;
    }
}

