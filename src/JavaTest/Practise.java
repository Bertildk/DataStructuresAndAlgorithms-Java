package JavaTest;
public class Practise{
    public static void main(String[] args) {
        System.out.println(recursionAmountOfDigits(-15263));
        System.out.println(recursionReverseNumber(121));
    }

    static int recursionAmountOfDigits(int n){
        if (n < 10 && n >= 0) return 1;
        else if (n < 0) return recursionAmountOfDigits(n*-1);        
        return 1 + recursionAmountOfDigits(n/10);
    }




    static boolean recursionReverseNumber(int n){
        return HelperFunc(n, 0) == n;

    }
    static int HelperFunc(int n, int reversedNumber){
        if (n == 0) return reversedNumber;
        return HelperFunc(n/10, reversedNumber * 10 + n%10);

        // n%10 = 12
    }
    
}