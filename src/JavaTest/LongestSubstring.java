package JavaTest;

import java.util.HashSet;

public class LongestSubstring { 
    public static void main(String[] args) {
        String s1 = "bbbbb";
        String s2= "abcabcbb";
        String s3 = "pwwkew";
        String s4 = " ";
       

        System.out.println(LongestSubstring.lengthOfLongestSubstringTwo("hgfdccba"));
        System.out.println(LongestSubstring.lengthOfLongestSubstringTwo(s1));
        System.out.println(LongestSubstring.lengthOfLongestSubstringTwo(s2));
        System.out.println(LongestSubstring.lengthOfLongestSubstringTwo(s3));
        System.out.println(LongestSubstring.lengthOfLongestSubstringTwo(s4));

    }


    public static int lengthOfLongestSubstringTwo(String s){
        HashSet<Object> uniqueItems = new HashSet<Object>();
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) { //right pointer
            char c = s.charAt(right);
            while(!uniqueItems.add(c)){ //if unique item spotted, remove it
                uniqueItems.remove(s.charAt(left));
                left++;
            }
            if(uniqueItems.size() > maxLength){
                maxLength = uniqueItems.size();
            }
        }
        
        
        return maxLength;
    }
    static boolean checkForDuplicates(String subString){ //true if no duplicates in string
        HashSet<Object> uniqueItems = new HashSet<Object>();
        for(Character c : subString.toCharArray()){
            if(!uniqueItems.add(c)){
                return false;
            }
        }

        return true;
    }
    public static int lengthOfLongestSubstring(String s) {//BAD SOLUTION
        int maxLength = 0;
        if(s.length() == 1) return 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String sub = s.substring(i,j);
                if(checkForDuplicates(sub)){ //If the substring has no duplicates
                    if(sub.length() > maxLength){
                        maxLength = sub.length();
                    }
                }
            }
        }


        return maxLength;
    }
    
}
