/*class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int i = 0;  // slow pointer

        for (int j = 1; j < nums.length; j++) {  // j=1 to compare

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}*/

class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
        
    }
}
