package DataStruct.Hashing;

import java.util.Random;
public class Cuckoo {
    public static void main(String[] args) {
        Random rnd = new Random();
        int size = 16;
        Cuckoo cuckoo = new Cuckoo(size);
        for (int i = 0; i < size-2; i++) {
            cuckoo.insert(rnd.nextInt(100), 0, rnd);
        }
        int[] arr = cuckoo.getHashTable();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)System.out.println("index: " + i + " value: " + arr[i]);
        }
    }
    /*
     * A hash table is basically an array where the index is determined by applying a hash function to the key.

        Each slot in the array represents a possible bucket for a key-value pair.


        Opgaven:
        Multiple-choice: We give a key two choices the h1(key) and h2(key) for residing.
        Relocation: It may happen that h1(key) and h2(key) are preoccupied.
        This is resolved by imitating the Cuckoo bird: it pushes the other eggs or young out of the nest when it hatches.
        Analogously, inserting a new key into a cuckoo hashing table may push an older key to a different location.
        This leaves us with the problem of re-placing the older key.

        Den SKAL håndtere en loadfaktor som overskrider over 0.5
        Loadfaktor = antal elementer indsat / størrelsen af hashtabellen

        Notes to self:
        Hashtables store keys together with their indexes, keys cant be duplicate, and to find the index a hashfunction is used.
        Implementation er super god, bare vigtigt at teste med forskellige cases, jeg brugte kun keys 0 - size, da jeg burde prøve tilfældige

     
        */
    private int[] hashTable;
    private int size;

    private int[] getHashTable(){
        return hashTable;
    }
    private int hashFunction1(int key) {
        return key % size;
    }

    private int hashFunction2(int key) {
        return (key / size) % size;
    }
    public Cuckoo(int size) {
        this.size = size;
        this.hashTable = new int[size];
        for (int i = 0; i < size; i++) {
            hashTable[i] = -1; // -1 indicates empty slot
        }
    }
    public void insert(int val, int attempts, Random rnd){
        if (attempts > size) return;
        int pos1 = hashFunction1(val);
        int pos2 = hashFunction2(val);
        int evicted = -1;

        boolean decider = rnd.nextBoolean();
        if(hashTable[pos1] == val || hashTable[pos2] == val) return; // Guard clause if value is duplicate dont insert

        if(hashTable[pos1] != -1 && hashTable[pos2] != -1){
           
            //Begge fyldte pladser
            evicted = decider ? hashTable[pos1] : hashTable[pos2];
            if(decider) hashTable[pos1] = val;
            else hashTable[pos2] = val;
            insert(evicted, attempts, rnd);
        }
        else if(hashTable[pos1] == -1){
            hashTable[pos1] = val;
        }else{
            hashTable[pos2] = val;
        }
     
    }
    

}