package JavaTest;

public class Practise5 {
    public static void main(String[] args) {
        System.out.println(CountEvenPositionsSumRecursive(123456));
    }

    static int CountEvenPositionsSumRecursive(int n){
        return HelperFunc2(n, 1);
    }
    static int HelperFunc2(int n, int pos){
        if(n == 0 ) return 0;
        return pos%2 == 0 ? n%10 + HelperFunc2(n/10, pos+1) : HelperFunc2(n/10, pos+1);
    }
    
}
