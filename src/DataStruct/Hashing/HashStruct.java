package DataStruct.Hashing;
import java.util.Random;
public class HashStruct{ 
    //Representerer en simpel HashTabel med Quadratic Probing til kollisioner
    int size;
    int[] HashTabel;
    public HashStruct(int size){
        this.size = size;
        this.HashTabel = new int[size];
        for (int i = 0; i < size; i++) {
            HashTabel[i] = 0;
        }
    }
    public int[] getHashValue(){
        return HashTabel;
    }
    public int getSize(){
        return size;
    }
   
    public void setValueQuadraticProbing(int val){
        int check = val % getSize();
        int i = 1;
        while (HashTabel[check] != -1){
            if(HashTabel[check] == val){ //Doesnt allow duplicates
                return;
            }
            check = (check + (i*i)); // checker den kvadratiske næste. 
            check %= size;
            i++;

        }
        HashTabel[check] = val; 
    }
    public void setValueLinearProbing(int val){ 
        int check = val % getSize();
        while (HashTabel[check] != -1 ){
            if(HashTabel[check] == val){ //Doesnt allow duplicates
                return;
            }
            check = (check + 1) % size ; //Linear checker næste i rækken
        }
        HashTabel[check] = val; 
    }
    public void AddBallToBucket(int index){
        HashTabel[index] += 1;
    }
    public void PowerOfChoiseAddBallToBucket(int index, int index2, Random rnd){
        if(HashTabel[index] == HashTabel[index2]){
            HashTabel[rnd.nextBoolean() ? index : index2] += 1;
            //Random 50/50 hvis der er samme mængde bolde i begge, så bins med lavt index ikke altid har flest bolde.
            // Det skete før fordi hver gang boldene var ens ville det med lavest index få den. 
        }
        else if (HashTabel[index] > HashTabel[index2]){
            HashTabel[index2] += 1;
        } else{
            HashTabel[index] +=1;
        }
    }

}