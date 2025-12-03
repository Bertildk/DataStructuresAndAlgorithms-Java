package JavaTest;

import java.util.Arrays;

public class anagramSpotter {
    public static void main(String[] args) {
        String w1 = "anagram", a1 = "nagaram";
        String ww1 = "banana", aa1 = "ananab"; 
        System.out.println(isAnagram(w1, a1));
        System.out.println(isAnagram(ww1, aa1));

    }
    static boolean isAnagram(String s, String t){
        int j = t.length()-1;
        int i = 0;
        System.out.println(t.charAt(j));
        while (i < j) {
            if(s.charAt(i) != t.charAt(j)){
                return false;
            }
            j--;
            i++;
        }
        return true;

    }


}
