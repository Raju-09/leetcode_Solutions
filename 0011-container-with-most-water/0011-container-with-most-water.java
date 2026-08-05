class Solution {
    public int maxArea(int[] height) {
        int left=0;int right=height.length-1;
        int are=Integer.MIN_VALUE;
        while(left<right){
            int width=right-left;
            int h=Math.min(height[left],height[right]);

            are=Math.max(are,width*h);
            if(height[left]<height[right]){

            
            left++;
            }
            else{
            right--;
            }
        }
        return are;
    }
}