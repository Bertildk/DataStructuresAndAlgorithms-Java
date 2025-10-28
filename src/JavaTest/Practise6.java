package JavaTest;
public class Practise6 {
    public static void main(String[] args) {
        System.out.println(recursiveSumOddNumbers(10));
        System.out.println(IterativeSumOfOddNumbers(10));
    }
    static int recursiveSumOddNumbers(int n){
        if(n == 0) return 0;
        return n % 2 != 0 ? n + recursiveSumOddNumbers(n-1) : recursiveSumOddNumbers(n-1);
    }
    static int IterativeSumOfOddNumbers(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if(i%2 != 0 ){
                sum += i;
            }
        }
        return sum;
    }
}
