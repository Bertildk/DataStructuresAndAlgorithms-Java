package Portfolio1;

public class task1 {
    public static void main(String[] args) {
        System.out.println(recursiveUnevenNumberSum(6));
        System.out.println(recursiveUnevenNumberSum(8));
        System.out.println(recursiveUnevenNumberSum(10));
    }
    private static int recursiveUnevenNumberSum(int n){
        if(n == 0) return 0;
        if(n % 2 == 0){
            return recursiveUnevenNumberSum(n-1);
        }else{
            return n*n + recursiveUnevenNumberSum(n-1);
        }
    }
}
