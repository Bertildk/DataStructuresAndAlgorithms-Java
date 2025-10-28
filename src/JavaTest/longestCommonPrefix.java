import java.util.Arrays;

public class longestCommonPrefix{
    public static void main(String[] args) {
        String[] strs = {"a"};
        String [] strs2 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        int i = 0;
        while(i < first.length() && i <last.length() && first.charAt(i) == last.charAt(i)){
            first.charAt(i);
            i++;
        }
        return first.substring(0, i);

    }

}