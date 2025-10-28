public class Test {
    public static void main(String[] args){
    
        System.out.println(sumOfNumber(1234));
        System.out.println(bedreSumOfNumber(1234));
        System.out.println(RecursionSumOfNumber(1234));
    }
    static int sumOfNumber(int n){
        int sum = 0;
        int nextDigit = n;
        for (int i = 0; i < String.valueOf(n).length(); i++) { // String conversion kan fjernes 
            int lastDigit = nextDigit % 10;
            nextDigit = nextDigit / 10;
            sum += lastDigit;
        }
        return sum;
    }

    static int bedreSumOfNumber(int n){
        int sum = 0;

        while(n != 0){
            sum += n % 10; // Plusser med det sidste tal
            n /= 10; // Dividere integer med 10, dvs fjerner det sidste tal
        }

        return sum;
    }
    static int RecursionSumOfNumber(int n){
        if(n == 0) return 0;
        return n % 10 + RecursionSumOfNumber(n/10);
    }
    /*
     
    static int RecursionSumOfNumber(int n){
        int sum = 0;
        if(n == 0) return sum;
        return sum = n % 10 + RecursionSumOfNumber(n/10);
    } 
     */
}