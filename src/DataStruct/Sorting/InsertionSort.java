package DataStruct.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        int[] array2 = {11,12,22,25,64};
        System.out.println(Arrays.toString(insertionSort(array2)));
        System.out.println(Arrays.toString(insertionSort(array)));
    }
    private static int[] insertionSort(int[] arr){
        
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Næste tal som bliver rykket ind i den sorterede liste
            int j = i - 1; // Index for det sidste tal i den sorterede liste
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j]; //Flytter tal et step til højre
                j = j - 1;
            }
            arr[j+1] = key; //Indsætter tallet på den rigtige plads
        }

        
        return arr;
    }

}

    
