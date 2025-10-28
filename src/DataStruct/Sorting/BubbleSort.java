package DataStruct.Sorting;

import java.util.Arrays;

public class BubbleSort {
    // Simple bubbleSort, Goes through the array O(n^2), Compares First number to second 
    static int[] bubbleSort(int[] arr){
        int steps = 0;
        int temp;
        boolean swapped = false; // This works as a breakaway if the innerloop finds no swaps, it can break out. 
        //Note: Each iteration of the innerloop, it will set swapped to true untill it doesnt find any new swaps then it can break out. 
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length-1-i; j++) { // The inner loop can be shorter for each iteration because bubblesort
                // "bubbles" the largest number to the end position for each outerloop iteration, so by minusing with i
                // the inner loop skips the last comparison.
                steps++;
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }

            }
            if(!swapped) break;
        }
        System.out.println("It took: " + steps + " Steps");
        return arr;
    }
/*
 * 
It took: 56 Steps
[1, 5, 19, 22, 42, 57, 65, 90]
First version of bubblesort


It took: 28 Steps
[1, 5, 19, 22, 42, 57, 65, 90]
Second version of bubblesort with -i in second loop avoiding duplicate checks on largest element. 

It took: 22 Steps
[1, 5, 19, 22, 42, 57, 65, 90]
Added break out of loop logic, if no new swaps are found in inner loop

 * 
 * 
 */
    public static void main(String[] args) {
        int[] arr = {22, 57, 1, 5, 19, 90, 65, 42};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }    
}