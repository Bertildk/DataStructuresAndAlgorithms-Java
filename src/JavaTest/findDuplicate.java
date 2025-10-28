import java.util.Arrays;
import java.util.HashSet;

public class findDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(IsDuplicate2(nums));
        int[] nums2 = {1,2,3,4};
        System.out.println(IsDuplicate2(nums2));

    }
    static boolean IsDuplicate(int[] nums){
        HashSet<Integer> myset = new HashSet<>();
        for (Integer integer : nums) {
            myset.add(integer);
        }
        
        return nums.length > myset.size() ? true : false;

    }
    static boolean IsDuplicate2(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
    return false;
    
    }
    

}
