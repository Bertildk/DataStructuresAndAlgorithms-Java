public class Exersice6A { //Binary search, if value is in arr return true otherwise false, arr is sorted
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr, -50));

    }
    static boolean binarySearch(int arr[], int value){
        int R = arr.length-1, L = 0;
        int mid = 0;
        while(L <= R){
            mid = (L+R) / 2;

            if(arr[mid] == value){
                return true;
            }
            else if(arr[mid] > value){
                R = mid-1;
            }else{
                L = mid + 1;
            }
        }
        return false;
    }

}
