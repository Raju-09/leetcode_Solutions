class Solution {
    public int trap(int[] height) {
        /*int n=height.length;
        int totalwater=0;
        int leftmax=0;
        for(int i=0;i<n;i++){
            for(int j=i;j>=0;j--){
                leftmax=Math.max(leftmax,height[j]);
            }

            int rightmax=0;
            for(int j=i;j<n;j++){
                rightmax=Math.max(rightmax,height[j]);
            }
            totalwater +=Math.min(leftmax,rightmax)-height[i];
        }
        return totalwater;*/

        int left=0;
        int right=height.length-1;

        int leftmax=0;
        int rightmax=0;

        int water=0;

        while(left<=right){
            leftmax=Math.max(leftmax,height[left]);
            rightmax=Math.max(rightmax,height[right]);

            if(leftmax<rightmax){
                water+=leftmax-height[left];
                left++;
            }else{
                water+=rightmax-height[right];
                right--;
            }
        }
        return water;
    }
}