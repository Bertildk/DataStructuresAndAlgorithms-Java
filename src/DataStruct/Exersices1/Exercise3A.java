package DataStruct.Exersices1;
public class Exercise3A {
    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sum(25));
        System.out.println(evenSquares(5));
        System.out.println(evenSquares(3));
        
    }
    //Sum of odd numbers
    static int sum(int n){
        if(n==0){
            return 0;
        } 
        return n * 2 - 1 + sum(n-1);
    }
    static int evenSquares(int n){
        if(n == 0){
            return 0;
        }
        return (n*2)*(n*2) + evenSquares(n-1);
    }
}
