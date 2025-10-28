public class Practise4 {
    public static void main(String[] args) {

        System.out.println(countSameDigit(12223, 2)); // Output : 3
        System.out.println(countSameDigit(55555, 5)); //Output : 5
        System.out.println(countSameDigit(-1223, 2)); // 2
        
    }
    static int countSameDigit(int n, int d){
        n = Math.abs(n); // makes n the absolute number

        if(n == 0) return 0;

        if (n % 10 == d){
            return 1 + countSameDigit(n/10, d);
        }else{
            return countSameDigit(n/10, d);
        }

        //return (n % 10 == d ? 1 : 0) + countSameDigit(n/10, d)
    }

}
