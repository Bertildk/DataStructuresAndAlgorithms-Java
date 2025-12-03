package Portfolio2;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String input = 
        "The cattle were running back and forth, but there was no wolf to be seen, heard, or smelled, so the shepherd decided to take a little nap in a bed of grass and early summer flowers. Soon he was awakened by a sound he had never heard before.";            
        System.out.println(MostCommonWord(input));
    }
    public static String MostCommonWord(String s){ //This is O(N) Becuase each loop isnt nested
        StringBuilder sb =  new StringBuilder();
        HashMap<String, Integer> WordsFrequency = new HashMap<>();
        for(Character c : s.toCharArray()){
            if(c != ' ' && c != ',' && c!= '.'){
                sb.append(c);
            }
            else if (sb.length() > 0){
                String word = sb.toString().toLowerCase();
                sb.setLength(0);
                if(WordsFrequency.containsKey(word)){
                    WordsFrequency.put(word, WordsFrequency.get(word) + 1);
                }else{
                    WordsFrequency.put(word, 1);
                }
                

            }
            
        }
        Integer maxFreq = 0;
        String word = "";
        for(Map.Entry entry : WordsFrequency.entrySet()){
            int val = (int) entry.getValue();
           if(val >= maxFreq){
                maxFreq = val;
                word = entry.getKey().toString();
           }
           
        }
        return word;
    }
}
