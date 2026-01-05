package AlgoritmerOgSortering.Sorting;

import java.util.Random;

public class sortingPractice {
    public static void main(String[] args) {
        int[] arr = {5,3,8,6,2,7,4,1};
        int[] arr2 = {12,11,13,5,6,7,67};
        int[] arr3 = {3,7,23,32,5,62,42};
        int[] arr4 = {1,5,7,43,2,7,9,4,2};
        int[] arr5 = {1,6,3,7,9,3,1,4,8,67};
        insertionSort(arr5);
        selectionSort(arr); // TODO
        quickSort(arr2, 0, arr2.length - 1);
        mergeSort(arr3, 0, arr3.length - 1);
        bubbleSort(arr4);
        System.out.println("SelectionSort");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("QuickSort");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("MergeSort");
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Bubblesort");
        for (int i : arr4) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("InsertionSort");
        for (int i : arr5) {
            System.out.print(i + " ");
        }
    }

    
    static void mergeSort(int[] arr, int low, int high){
        // split array into multiple subarrays
        // continously sort the subarrays 
        // untill entire arr is sorted
        // merge sorted subarrays back together in order
        if(low >= high) return;
        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        
        merge(arr, low, high, mid);
    }
    
    static void merge(int[] arr, int low, int high, int mid){
        
    }

    static void quickSort(int[] arr, int low, int high){
        // Split arr into two parts, based on pivot
        // sort the pivot into correct place
        // numbers < pivot left of pivot and number > pivot right of pivot.
        if(low >= high) return;
        int pivot = partition(arr, low, high);

        quickSort(arr, low, pivot-1);
        quickSort(arr, pivot+1, high);
    }
    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, high, i+1);

        return i+1;
    }
    static void bubbleSort(int arr[]){
        //Continuosly swap Neighboor indexes into correct positions
        //For each iteration largest number should be placed last in list. 
        // O(n) to check if list is sorted, with swapped logic 
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    swapped = true;
                    swap(arr, j, j+1);
                }
            }
            if(!swapped) return;
        }

    }
    static void insertionSort(int arr[]){
    // Key = i, compare key with pointer to highest number in sorted subarray.
    // Continue doing that while reducing j (pointer), untill correct spot is found. 
    // Then put key into given spot
        int key;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    static void selectionSort(int arr[]){
        // Iterate through the loop
        // Find smallest integer 
        // swap it with the first number. 
        // continue untill sorted. 
        int smallestIntegerIndex;
        for (int i = 0; i < arr.length; i++) {
            smallestIntegerIndex = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[smallestIntegerIndex]) smallestIntegerIndex = j;
            }
            swap(arr, i, smallestIntegerIndex);
        }
    }

    static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
