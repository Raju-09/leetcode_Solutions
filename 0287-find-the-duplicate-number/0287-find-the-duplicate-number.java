class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n];
        for(int num : nums){
            if(present[num]){
                return num;
            }
            present[num] = true;
        }
        return -1;
    }
}