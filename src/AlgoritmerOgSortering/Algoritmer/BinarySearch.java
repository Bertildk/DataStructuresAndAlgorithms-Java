package AlgoritmerOgSortering.Algoritmer;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 4;
        boolean found = binarySearch(numbers, target);
        System.out.println("Target " + target + " found: " + found);
        target = 6;
        found = binarySearch(numbers, target);
        System.out.println("Target " + target + " found: " + found);
    }

    public static boolean binarySearch(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
}
