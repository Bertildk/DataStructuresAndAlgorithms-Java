package Portfolio1;

public class task6 {
    public static void main(String[] args) {
        System.out.println(sumDivisibleBy3(9));
    }
    private static int sumDivisibleBy3(int n){
        if(n == 0) return 0;
        if(n % 3 == 0)
            return n + sumDivisibleBy3(n-3); // -3  
        else 
            return  sumDivisibleBy3(n-1);
        
    }
}
