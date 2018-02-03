//349. Intersection of Two Arrays

class Solution {
    //way 1: 2-pointers 
    // public int[] intersection(int[] nums1, int[] nums2) {
    //     Set<Integer> set = new HashSet<>();
    //     if(nums1.length == 0 || nums2.length == 0){
    //         return new int[0];
    //     }
    //     Arrays.sort(nums1);
    //     Arrays.sort(nums2);
    //     int p1 = 0;
    //     int p2 = 0;
    //     while( p1 < nums1.length && p2 < nums2.length){
    //         if(nums1[p1] == nums2[p2] ){
    //             set.add(nums1[p1]);
    //             p1 ++;
    //             p2 ++;
    //         }
    //         else if(nums1[p1] < nums2[p2]){
    //             p1++;
    //         }
    //         else if(nums1[p1] > nums2[p2] ){
    //             p2++;
    //         }
    //     }
    //     int[] res = new int[set.size()];
    //     int p = 0;
    //     for(Integer num : set){
    //         res[p++] = num;
    //     }
    //     return res;
    // }
    //way 2 two Sets, one for store one of the array, 
    //then compare with another array, one for store 
    //results 
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> inter = new HashSet<>();
        if(nums1.length == 0 || nums2.length == 0){
            return new int[0];
        }
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int j = 0; j < nums2.length; j++){
            if(set.contains(nums2[j])){
                inter.add(nums2[j]);
            }
        }
        
        int[] res = new int[inter.size()];
        int p = 0;
        for(Integer num : inter){
            res[p++] = num;
        }
        return res;
    }
    
}

//Intersection of Two Arrays II
//change above two-pointer method, change the "HASHSET" to "List", store the results  