import java.util.ArrayList;

public class Practise2 {
    //Greatest Common Divisor
    public static void main(String[] args) {
        int a = 48, b = 18;
        //System.out.println(GCD(a, b));
        //System.out.println(Arrays.toString(listDivisors(48)));
        // Denne løsning er ikke effektiv og løser det i O(n^2) og lister alle divirsors O(n)
        //Hvor en effektiv løsning kan løse det i O(log n), vha recursion. 
        System.out.println(GCDRecursive(a, b));

    }

    static int GCD(int a, int b){
        int[] divisorsOfa = listDivisors(a);
        int[] divisorsOfb = listDivisors(b);

        for (int i = divisorsOfa.length-1; i > 0; i--){
            for (int j = divisorsOfb.length-1; j > 0; j--) {
                if(divisorsOfa[i] == divisorsOfb[j]){
                    return divisorsOfa[i];
                }
            }
        }

        return 0;
    }

    static int[] listDivisors(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < n+1; i++) {
            if(n % i == 0){
                divisors.add(i);
            }
        }

        int[] result = new int[divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            result[i] = divisors.get(i);
        }
        return result;

    }
    
    static int GCDRecursive(int a, int b){
        System.out.println(a+ " "+ b);
        if(a == 0 && b == 0) return 0;
        if(b == 0) return a;
        return GCDRecursive(b, a%b);
        

    }

}
