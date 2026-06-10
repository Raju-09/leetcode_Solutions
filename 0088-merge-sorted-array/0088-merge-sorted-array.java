/*class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] a=new int[n+m];
        int index=0;
        for(int i=0;i<m;i++){
            a[index]=nums1[i];
            index++;
        }
        for(int j=0;j<n;j++){
            a[index]=nums2[j];
            index++;
        }
        Arrays.sort(a);
        for(int i=0;i<m+n;i++){
          nums1[i]=a[i];
        }
    }
}*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       /* int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }*/

        for(int i=0;i<n;i++){
          nums1[m+i]=nums2[i];

        }
        Arrays.sort(nums1);
       
    }
}