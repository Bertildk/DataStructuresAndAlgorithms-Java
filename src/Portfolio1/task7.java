package Portfolio1;

import java.util.Arrays;

public class task7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findNaturalNumberAndExponent(6561)));
    }
    private static int[] findNaturalNumberAndExponent(int n){
        double steps = Math.sqrt(n) - 1;
        // begrænser mængden af iterationer, vha steps så den ikke returnere: n, 2
        for (int i = (int) steps; i > 2; i--) { 
            double exponent = Math.log(n) / Math.log(i); //log, base i af n = exponent 
            if(exponent % 1 == 0){
                return new int[]{i, (int)exponent}; 
            }
        }

        return new int[]{-1};
    }
}
