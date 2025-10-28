package JavaTest;
import java.util.HashMap;
import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        Integer[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(TwoSum(arr, target)));
    }
    static int[] TwoSum(Integer[] arr, int target){
        HashMap<Integer, Integer> myMap;
        myMap = populateMap(arr);
        for (int i = 0; i < arr.length; i++) {
            int checkFor = target - arr[i];
            if(myMap.containsKey(checkFor) && i != myMap.get(checkFor)){
                return new int[] {i, myMap.get(checkFor)};
            }
        }
        return null;
    }
    static HashMap populateMap(Integer[] arr){
        HashMap<Integer, Integer> populatedMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            populatedMap.put(arr[i], i);
        }
        return populatedMap;
    }
}
