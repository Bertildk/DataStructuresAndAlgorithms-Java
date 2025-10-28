package DataStruct.Sorting;

public class sortingPractice {
    public static void main(String[] args) {
        int[] arr = {5,3,8,6,2,7,4,1};
        int[] arr2 = {12,11,13,5,6,7};
        int[] arr3 = {3,7,23,32,5,62,42};
        insertionSort(arr);
        mergeSort(arr2, 0, arr2.length - 1);
        mergeSort(arr3, 0, arr3.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : arr3) {
            System.out.print(i + " ");
        }
    }

    
    static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        
        merge(arr, low, high, mid);
    }
    
    static void merge(int[] arr, int low, int high, int mid){
        int n1 = mid - low + 1;
        int n2 = high - mid;
    
        int[] left = new int[n1];
        int[] right = new int[n2];
    
        for (int i = 0; i < n1; i++) {
            left[i] = arr[i + low];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[i + mid + 1];
        }
        int i = 0; int j = 0; int k = low;
        while(i < n1 && j < n2){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j < n2){
            arr[k] = right[j];
            k++;
            j++;
        }

    }
    static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }


    static void quickSort(int[] arr, int low, int high){
        if(low >= high) return;
        int pivot = partition(arr, low, high);

        quickSort(arr, pivot+1, high);
        quickSort(arr, low, pivot-1);
    
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = low -1;
        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        //pivot swap into its correct position
        swap(arr, high, i+1);
        return i + 1;
    }
    static void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    static void insertionSort(int arr[]){
        
    }

}
