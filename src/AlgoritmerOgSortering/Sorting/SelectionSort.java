package AlgoritmerOgSortering.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(selectionSort(array)));
    }

    /*
        In SelectionSort you first find the smallest element in the list and place in the first position using a
        simple swap-operation3. Then you find the second-smallest element and swap it into the second
        position and so on
     */
    private static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[index]){
                    index = j; //stores index of smallest number
                } 
            }
            int tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
        return arr;
    }
}
