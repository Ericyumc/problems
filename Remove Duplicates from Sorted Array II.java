////Remove Duplicates from Sorted Array II

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        } 
        Set<Integer> set = new HashSet<>();
        ////to check only appear twice
        int j = 1;
        int i = 0;
        while(i < nums.length){
            if(i > 0 && nums[i - 1] != nums[i]){
                nums[j] = nums[i];
                j++;
                i++;
            } else if (i > 0 && nums[i - 1] == nums[i]){
                if(!set.contains(nums[i])){
                    nums[j] = nums[i];
                    set.add(nums[i]);
                    j++;
                    i++;
                } else{
                    i++;
                }
            } else{
                i++;   
            }
            ////Do not forget the last situation 
        }
        return j;
    }
}