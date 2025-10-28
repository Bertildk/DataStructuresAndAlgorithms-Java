package AlgoritmerOgSortering.Sorting;
public class quickSort {
//quick sort er en divide and qonquer, hvor rekursion bruges til at sortere mindre og mindre dele af et array. 
// Man vælger et pivot, her er det sidste element i arrayet, og så partitionere man arrayet så at alle elementer < pivot er til venstre for pivot og omvendt for elemter > pivot.
// Herefter kalder man quicksort rekursivt på venstre og højre side af pivot.
    public static void main(String[] args) {
        int[] arr = {34, 7, 23, 32, 5, 62, 42};

        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    //worst case for quicksort er når listen allerede er sorteret, da alting konstant vil falde til venstre siden (træ visualiseret).
    static void quickSort(int[] arr, int low, int high){
        if(low >= high) return; //base case, hvis high = 0, eller high = arr.length så pga kaldet der siger +/- 1, vil man få out of bounds exception. 
        int pivot = partition(arr, low, high);
        
        quickSort(arr, pivot + 1, high);
        quickSort(arr, low, pivot - 1);

    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int tmp;
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){ // By the end of this all elements < pivot are at indexes < i, therefor i + 1 is the correct position. 
                i++; // is a pointer starting at low - 1 (-1 first partition). If no swaps occur, 
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;

            }
        }
        tmp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = tmp;
        return i+1;
    }

}
