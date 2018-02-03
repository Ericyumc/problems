//Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i - 1] != nums[i]){
                nums[j] = nums[i];
                j++;
            } 
        }
        return j;
    }
    //Do not use any extra space
}