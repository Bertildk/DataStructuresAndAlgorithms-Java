package JavaTest;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(isDuplicate2(nums));
        int[] nums2 = {1,2,3,4};
        System.out.println(isDuplicate2(nums2));

    }
    static boolean isDuplicate(int[] nums){
        HashSet<Integer> myset = new HashSet<>();
        for (Integer integer : nums) {
            myset.add(integer);
        }
        
        return nums.length > myset.size() ? true : false;

    }
    static boolean isDuplicate2(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
    return false;
    
    }
    

}
