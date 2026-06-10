/*class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0,count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]<10){
            sum+=nums[i];
        }else{
            count+=nums[i];
        }
       } 
      return sum!=count;
    }
}*/

class Solution {
    public boolean canAliceWin(int[] nums) {
       int single=0;
       int doubl=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]<10)
        single+=nums[i];
        else
        doubl+=nums[i];
       } 
       if(single==doubl)
       return false;

       return true;
    }
}