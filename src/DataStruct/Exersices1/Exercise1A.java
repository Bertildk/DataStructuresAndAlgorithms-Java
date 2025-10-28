package DataStruct.Exersices1;
public class Exercise1A{
    public static void main(String[] args) {
        System.out.println(logTwo(4096));
    }


    static int logTwo(int n){
        //Preconditions N > 0 AND A power of 2 32, 4096 etc. 
        // Returns the base 2 algorithm of n
        // log2(n) = y, 2^y = n
        //Log2 base, 2^x = n spørgsmålet er hvad er x?
        //Finder frem til svaret ved at sige gøre det omvendt ved at rekursivt finde ud af hvor mange gange n kan skal divideres med 2 før det giver 1. 
        if(n == 1){
            return 0;
        }
        return 1+logTwo(n/2);

    }

}