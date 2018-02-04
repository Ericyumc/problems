//Merge two sorted array // no extra space, put it in nums1 array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ////backward put the larger one into nums1 
        int i = m - 1;
        int j = n - 1;
        int k = m + n -1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            } else if(nums1[i] < nums2[j]){
                nums1[k--] = nums2[j--];
            } else{
                nums1[k--] = nums1[i--];
                nums1[k--] = nums2[j--];
            }
        }
        ///when the nums1 finished first, then we need consider put nums2 into nums1, but for nums2 finished first, we donot need consider cause it was sorted already
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
        
    }
}