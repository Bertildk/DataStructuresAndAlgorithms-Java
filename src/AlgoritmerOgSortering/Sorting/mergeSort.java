package AlgoritmerOgSortering.Sorting;

import java.util.Arrays;
//rekursiv sorterings algoritme der deler et array i to halvdele, sortere hver halvdel og merge dem sammen igen.
public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {2,6,2,1,7,9,3,1,3,6};

        mergeSort(arr, 0 , arr.length-1);

       for (int i : arr) {
            System.out.print(i + " ");
       }

    }


    static void mergeSort(int[] arr, int low, int high){
        if(low < high){
            
            int mid = low + (high - low) / 2; // low = 0, high = 1: 0 + (1 - 0) / 2 cast to int = 0
            // kommentaren beskriver base case. 
            
            mergeSort(arr, low, mid); //rekursivt kald -> dette kald repræsentere venstresiden af arrayet. 
            // Det vil blive ved med at rekursivt kalde sig selv før den går videre til højresiden. 
            mergeSort(arr, mid + 1, high);
            
            merge(arr, low, high, mid);
        }
    }

    static void merge(int[] arr, int low, int high, int mid){
            int n1 = mid - low + 1;
            int n2 = high - mid; 
            
            int[] subArrayOne = new int[n1];
            int[] subArrayTwo = new int[n2];

            for (int i = 0; i < n1; i++) {
                subArrayOne[i] = arr[i + low];
            }
            for (int i = 0; i < n2; i++) {
                subArrayTwo[i] = arr[i + mid + 1];
            }
            int i = 0; int j = 0; int k = low;
            while(i < n1 && j < n2){
                if(subArrayOne[i] <= subArrayTwo[j]){
                    arr[k] = subArrayOne[i];
                    i++;
                }else{
                    arr[k] = subArrayTwo[j];
                    j++;
                }
                k++;

            }
            while (i < n1){
                arr[k] = subArrayOne[i];
                i++;
                k++;
            }
            while(j < n2){
                arr[k] = subArrayTwo[j];
                j++;
                k++;
            }

    }
}
