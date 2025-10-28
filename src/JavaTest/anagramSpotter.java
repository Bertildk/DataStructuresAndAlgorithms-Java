
import java.util.Arrays;
import java.util.TreeSet;

public class anagramSpotter {
    public static void main(String[] args) {
        String w1 = "arc", a1 = "car";
     
        System.out.println(isAnagram(w1, a1));

    }
    static boolean isAnagram(String s, String t){
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(arr);
        System.out.println(arr2);
        return Arrays.equals(arr, arr2);

    }


}
