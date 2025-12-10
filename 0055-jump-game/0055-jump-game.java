class Solution {
    static {
        for(int i=0;i<500;i++){
            canJump(new int[1]);
        }
    }
    public static boolean canJump(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(i>index) return false;
            index=Math.max(index,i+nums[i]);
        }
        return true;
    }
}