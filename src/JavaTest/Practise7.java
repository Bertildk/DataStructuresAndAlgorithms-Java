

public class Practise7 {
    public static void main(String[] args) {
        int nums[] = {1,2,2,3,3,3,3,3,3,3,3,3,3,4,5,6};
        
        binarySearch(3, nums);
        System.out.println(findFirstIndexOfTargetBinarySearch(3, nums));
    }

    static void linearSearch(int n, int[] nums){
        for (int number : nums) {
            if(number == n){
                System.out.println("Number found in Array");
                return;
            }

        }
        System.out.println("The number wasnt found");

    }

    static void binarySearch(int target, int[] nums){
        int left = 0;
        int right = nums.length-1;

        while (left <= right){
            int mid = (left + right) / 2; 
            if(nums[mid] == target){
                System.out.println("found target " + target + " at index " + mid);
                return;
            } 
            if (nums[mid] < target) {
                left = mid + 1;
            }else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        System.out.println(target + " Not found -1");
    }

    static int findFirstIndexOfTargetBinarySearch(int target, int[] nums){
        int left = 0;
        int right = nums.length-1;
        int result = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            if (nums[mid] == target){
                result = mid;
                right = mid -1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }
            
        }
        return result;
    }

    


}
