package Portfolio1;

import java.util.Arrays;

/*
 * 
 * Tids kompleksiteten af den her algoritme er:
 * Først bliver InsertionSort brugt dens tidskompleksitet er O(n^2) i det bedste tilfælde er den O(n) 
 * Jeg valgte InsertionSort over BubbleSort fordi den er gennemsnitligt mere effektiv, fordi den laver færre swaps. 
 * Derefter tæller algoritmen stemmerne, dens tidskompleksitet er O(n)
 * 
 * tidskompleksitet er O(N^2) da InsertionSorts worst case er O(n^2).
 * 
 */
public class task11 {
    public static void main(String[] args) {
        int[] arr = {7,4,3,5,3,1,6,4,5,1,7};
        System.out.println(Election(arr));
    }
    private static int Election(int[] results){

        int[] sorted_results = insertionSort(results);
        int highest_count = 0, count = 0;
        int current_value = sorted_results[0];
        int candidate_number = -1;
        for (int i = 0; i < sorted_results.length; i++) 
        {
            if(sorted_results[i] == current_value) count++;
            else{
                if(count > highest_count) {
                    highest_count = count;
                    candidate_number = current_value;
                }    
                count=1;
                current_value = sorted_results[i];
            }

        }

        return (highest_count > sorted_results.length/2) ? candidate_number : -1;
    }

    private static int[] insertionSort(int[] arr){ // Insertion sort is faster than bubblesort for smaller arrays, 
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;

        }
        
        return arr;
    }

    
}
