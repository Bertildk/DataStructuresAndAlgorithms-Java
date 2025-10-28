package DataStruct.Hashing;
import java.util.Arrays;
import java.util.Random;
import java.util.random.*;

public class Exercise1 {
    /**Hashing - (Problemet: Kollisioner i Hashtabel (Hashmap))
    Given en funktion kan flere indexer have samme resultat, det giver en kollision eks.
    h(x) = x mod 11
    16 mod 11 = 5
    27 mod 11 = 5
    Flere forskellige værdier kan få samme hashværdi så ender de i samme indeks, altså en kollision.

    Man håndtere en kollision ved at bruge flere forskellige metoder såsom, separate chaining, linear probing, quadratic probing. 
    Quadratic probing
    h(x) + i^2 
    linear probing
    h(x) + i
    Linear probing har en større chance for at støde ind i clusters hvilket vil sige
    At mange af de næste pladser i tabellen allerede er fyldt. 
    For hver kollision bliver i + 1, altså i øges med 1
    Man bliver ved indtil man finder en ledig plads. 
    */


    public static void main(String[] args) {
        /* 
        HashStruct HS = new HashStruct(11);
        int[] struct = HS.getHashValue();
        HS.setValueLinearProbing(3);
        HS.setValueQuadraticProbing(3);
        
        for (int i = 0; i < struct.length; i++) {
            if(struct[i] != -1){
                System.out.println(struct[i] + " With index: " + i);
            }
        }
        */
      
        /*
        opg 1 10k balls and bins
        The average balls in a bin is: 1
        The max amount of balls in a bin was: 6 it was in bin: 790

        opg 2 - 32k balls & bins
        The average balls in a bin is: 1
        The max amount of balls in a bin was: 6/7/8 it was in bin: 1668
        ran it a few times

        the more balls & bins the closer the max number gets to be identical. 


        opg 3: Power of Choise
        10007:
        The average balls in a bin is: 1
        The max amount of balls in a bin was: 3 it was in bin: 36

        32749:
        The average balls in a bin is: 1
        The max amount of balls in a bin was: 3 it was in bin: 21262

        opg 4: Forbedrede koden til at kører mange simulationer og retunere gennemsnitlige maks boldte

        32749:
        The average max balls in a bin for: 5000 simulations was: 3.1758 with a total of 32749 balls and bins
        Power of choice ^^ 
        ln ln 32749 = 2.34148149455

        10007:
        The average max balls in a bin for: 5000 simulations was: 3.0586 with a total of 10007 balls and bins        
        Power of choice ^^
        ln ln 10007 = 2.22040277843
        Mine eksperimenter kan ikke fuldstændigt bevise dem, de skulle kørers i længere tid, men det er tætte på.


        M = N^2 dvs. Buckets = Balls^2
        32749:

        10007:
        */
        int amount_of_balls = 10007;
        Random rnd = new Random();
        int amountOfSimulations = 200;
        float avg_max = SimulateBallsAndBinns(amount_of_balls, rnd, amountOfSimulations);
       // System.out.println("The average max balls in a bin for: " + amountOfSimulations+ " simulations was: " + avg_max + " with a total of "+ amount_of_balls + " balls and bins");
        System.out.println(avg_max + " buckets held more than One ball");
    }

    private static float SimulateBallsAndBinns(int amount_of_balls, Random rnd, int amountOfSimulations) {
        int max = 0;
        float total_max = 0;
        int m = amount_of_balls * amount_of_balls;
        for (int j = 0; j < amountOfSimulations; j++) {
            //For each new sim
            HashStruct BallsAndBins = new HashStruct(m);
            int[] list = BallsAndBins.getHashValue();

            for (int i = 0; i < amount_of_balls; i++) {
                //BallsAndBins.AddBallToBucket(rnd.nextInt(amount_of_balls));
                BallsAndBins.PowerOfChoiseAddBallToBucket(rnd.nextInt(m), rnd.nextInt(m), rnd);
            }
            for (int i = 0; i < m; i++) {
                if(list[i] > max){
                    max = list[i];
                    if(max > 1){
                        total_max += 1;
                        break;
                    }
                }
            }  
            //total_max += max;
            max = 0;
        }
        return total_max ;
    }
    
}
