package AlgoritmerOgSortering.Sorting;
import java.util.Arrays;
import java.util.Random;
public class qs {
    Random random = new Random();

    public static void main(String[] args) {
        qs Qs = new qs();
        Qs.run();    
    }

    public void run(){
        int[] arr = {3,5,7,1,4,2,5,9,3};
        
        System.out.println(Arrays.toString(arr));
        qs(arr, 0, arr.length -1);

        System.out.println(Arrays.toString(arr));
    }
    public void qs(int[] arr, int start, int end){
        if(start >= end) return;
        int pivot = partition(arr, start, end);

        qs(arr, start, pivot-1);
        qs(arr, pivot+1, end);
    }
    public int partition(int[] arr, int start, int end){
        int pivotIndex = random.nextInt(start, end+1);
        int pivot = arr[pivotIndex];
        swap(arr, end, pivotIndex);
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if(arr[j] < pivot){
                i++;
                swap(arr, j, i);
            }
        }
        swap(arr, i+1, end);
        return i+1;
    }
    public void swap(int[] arr, int x, int y){
        int tmp;
        tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }

    /*
    Noter til mig selv vdr. Quicksort.

    Partition er den hovedsaglige logik for at sortere listen. 
    Man tager og sortere listen ift det pivot.
    og retunere pivot indexed. 

    Ved at gøre det opdeler man rekursivt listen i to dele. 

    
    
    */


}
