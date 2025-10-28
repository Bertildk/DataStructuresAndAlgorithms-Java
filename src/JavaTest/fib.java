package JavaTest;

import java.util.ArrayList;
import java.util.Arrays;

public class fib {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fibList(35)));
    }

    static int fib(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }

    static int[] fibList(int n){
        ArrayList<Integer> fibsNumbers= new ArrayList<>();
        
        
        for (int i = 0; i < n; i++) {
            fibsNumbers.add(fib(i));
        }

        int[] arr = new int[fibsNumbers.size()];
        for (int i = 0; i < fibsNumbers.size(); i++){
            arr[i] = fibsNumbers.get(i);
        }
        return arr;
        
    }
}
