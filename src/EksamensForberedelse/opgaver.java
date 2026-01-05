package EksamensForberedelse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class opgaver {
    public static void main(String[] args) {
        opgaver Opgaver = new opgaver();
        Opgaver.run();
    }
    public void run(){
        System.out.println(logTwo(32));
        int length = 0;
        int longestLength = 0;
        int startingNumber = 0;
        int[] cache = new int[10000];
        for (int i = 1; i < 10000; i++) { 
            long n = i;
            length = 0;
            while(n != 1 && (n >= 10000 || cache[(int)n] == 0)){
                if(n % 2 == 0){
                    n = n/2;
                    
                }else{
                    n = 3*n + 1;
                }
                length++;
            }      
            length += cache[(int)n];    
            if (length > longestLength) {
                longestLength = length;
                startingNumber = i;
            }
            cache[i] = length;
            }
            System.out.println("Longest chain at: " + longestLength + " with starting number: " + startingNumber);
            System.out.println(pythagorean());
            System.out.println(amountOfValidPassword());
            System.out.println(minimunHeightBST(31));
            System.out.println(fib(20));
            System.out.println(pow(2, 5));
            System.out.println(reverseRecursive("hello"));
            System.out.println(digitCounter(12354));
            int[] arr = {1,5,7,1,54,5,3,1,5,7,9,0,2,1,3,5,6};
            System.out.println(secondLargestNumber(arr));
            int[] arrtwo = {1,2,3,4,5,6,7,8,9,10,11,12,13};
            System.out.println(checkIfSortedRecursive(arr, 0));
            System.out.println(checkIfSortedRecursive(arrtwo, 0));
            System.out.println(binarySearch(arrtwo, 0, arrtwo.length - 1, 12));
            System.out.println(binarySearch(arrtwo, 0, arrtwo.length - 1, 14));
            int[] arrthree = {1,2,3,4,5,6,8,9,10};
            System.out.println("Missing number is: "+findMissingNumber(arrthree, arrthree.length+1));
            System.out.println(sumOfDigitsRecursive(1234));
            System.out.println(countOccurrencesRecursive(arr, 0, 1));
            System.out.println(isPalindrome("radar"));
            System.out.println(isPalindrome("hello"));
            System.out.println(isPalindromeRecursive("radar", 0, "radar".length() - 1));
            System.out.println(isPalindromeRecursive("hello", 0, "hello".length() - 1));
            int[] arrfour = {1,1,2,3,3,4};
            System.out.println(removeDuplicates(arrfour));
            System.out.println(removeDuplicatesRecursive(arrfour, 0, 1));
            int[] arrfive = {1,2,3,4,5,6,7,8,9};
            System.out.println(binarySearchInteger(arrfive, 4));
            String sentence = "this is a sentence";
            System.out.println(LongestWordInSentence(sentence));
            System.out.println(ReverseSentence(sentence));
            int[] arr1 = {1, 3, 5, 0, 0, 0}; // extra space for arr2
            int[] arr2 = {2, 4, 6};
            System.out.println(Arrays.toString(mergeTwoSortedArraysInPlace(arr1, arr2)));
        }

   
    public int func(int n){
        if(n <= 1) return 0;
        if(n % 2 == 0){
            return 1 + func(n/2);
        }else{
            return 1 + func(3*n + 1);
        }
    }
    public int logTwo(int n){
        if(n <= 1) return 0;
        return 1 + logTwo(n/2);
    }
    public long pythagorean(){
        // a < b < c
        // a^2 + b^2 = c^2
        // a + b + c = 1000
        
        for (int b = 1; b < 1000; b++) {
            for (int a = 1; a < b; a++) {
                int c = 1000 - a - b;
                if(a < b && a < c && b < c){
                    if(a*a + b*b == c*c){
                        System.out.println("a: "+ a + " b: " + b + " c: " + c);
                        return a*b*c;
                    }
                }
            }
        }
        return -1;
    }
    public int getNumberEqual(int[] x, int n, int val){
        if (n < 0) return 0 ;
        if(x[n-1] == val){
            return 1 + getNumberEqual(x, n-1, val);
        }
        else return 0 + getNumberEqual(x, n-1, val);
    }
    public int sumUnderN(int n){
        if(n == 0) return 0;
        return n + sumUnderN(n-1);
    }
    public int amountOfValidPassword(){
        // Must contain 6 digits [1-9]
        // Must be in ascending order
        // No duplicates
        boolean valid;

        int count = 0;
        for (int i = 100000; i <= 456789; i++) {
            valid = true;
            String password = Integer.toString(i);
            HashSet<Character> set = new HashSet<>();
            for (Character c: password.toCharArray()) {
                set.add(c);
                if(c == '0') valid = false;
            }
            
            for (int j = 0; j < password.length()-1; j++) {
                if(!(password.charAt(j) < password.charAt(j+1))) valid = false;
            }

            if(set.size() != password.length()) valid = false;
            if(valid) count++;
        }
        
        return count;
    }
    public int sumOfEvenNumbersSquared(int n){
        if(n == 0) return 0;
        if(n % 2 == 0){
            return n*n + sumOfEvenNumbersSquared(n-1);
        }else return sumOfEvenNumbersSquared(n-1);
    }
    public int sumOfOddIntegersToN(int n){
        if(n <= 0) return 0;
        if(n % 2 != 0) return n + sumOfEvenNumbersSquared(n-2);
        else return sumOfOddIntegersToN(n-1);
    }
   
    public int minimunHeightBST(int nodes){
        // N = 2^h+1 - 1
        // example: 2^4+1 -1 = 31
        // minimun height for tree with 31 nodes is 4
        // Rewritten formular into method
        // Log2(N+1) - 1 = Hmin 
        nodes = 31;
        double minHeight = Math.ceil(Math.log(nodes+1) / Math.log(2)) - 1;
        return (int) minHeight;
    }
    public boolean Isanagram(String a, String b){
        if(a.length() != b .length()) return false;
        
        char[] charsA = a.toCharArray();
        Arrays.sort(charsA);
        char[] charsB = b.toCharArray();
        Arrays.sort(charsB);
        a = new String(charsA);
        b = new String(charsB);
        
        if(a.equals(b))return true; 
        else return false;
        
    }
    int[] cache = new int[10000];
  
    public int fib(int n){
        if(n <= 1) return n;
        if(cache[n] != 0) return cache[n];
        
        cache[n] = fib(n-1) + fib(n-2);
        return cache[n];
    }
    public int pow(int n, int exp){
        if(exp == 0) return 1;
        return n* pow(n, exp-1);
    }
    public String reverseRecursive(String s){
       return reverse(s, 0, s.length()-1);
    }
    public String reverse(String s, int left, int right){
        if(left >= right) return s;
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        char tmp = s.charAt(left);
        sb.setCharAt(left, sb.charAt(right));
        sb.setCharAt(right, tmp);
        return reverse(sb.toString(), ++left, --right);
    }
    public int digitCounter(int n){
        if(n < 10) return 1;
        return 1 + digitCounter(n/10);
    }
    public int secondLargestNumber(int[] n){
        int largest = n[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < n.length; i++) {
            if(n[i] > largest) {
                secondLargest = largest;
                largest = n[i];
            }else if(n[i] < largest && n[i] > secondLargest){
                secondLargest= n[i];
            }
        }
        return secondLargest;
    }
    public boolean checkIfSortedRecursive(int[] n, int index){
        if(index == n.length-1) return true;
        if(n[index] < n[index+1]) return checkIfSortedRecursive(n, ++index);
        else return false;
    }
    public boolean binarySearch(int[] arr, int left, int right, int target){
        if(left > right) return false;
        int mid = left + (right - left) / 2;
        int numberFound = arr[mid];
        if(numberFound == target) return true;
        if(numberFound < target){
            left = mid + 1;
            return binarySearch(arr, left, right, target);
        }else{
            right = mid -1 ;
            return binarySearch(arr, left, right, target);
        }
    }
    public int findMissingNumber(int[] arr, int n){
        //n actual array size
        int sum = 0;
        int expectedsum = 0;
        for (int i = 1; i <= n; i++) {
            expectedsum += i;
        }
        for (int i : arr) {
            sum += i;
        }
        return expectedsum - sum;

    }
    public int sumOfDigitsRecursive(int n){
        if(n < 10) return n;
        return n%10 + sumOfDigitsRecursive(n/10);
    }
    public int countOccurrencesRecursive(int[] arr, int index, int value){
        if(index == arr.length) return 0;
        if(arr[index] == value) return 1 + countOccurrencesRecursive(arr, ++index, value);
        else return countOccurrencesRecursive(arr, ++index, value);
    }
    public boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
    public boolean isPalindromeRecursive(String str, int left, int right){
        if(str.charAt(left) != str.charAt(right)) return false;
        if(left >= right) return true;
        else return isPalindromeRecursive(str, ++left, --right);
    }

    public int removeDuplicates(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
            
        }
        return i+1;
    }
    public int removeDuplicatesRecursive(int[] arr, int uniqueIndex, int j){
        if(j == arr.length - 1) {
            return uniqueIndex;
        }
        if(arr[uniqueIndex] != arr[j]){
            uniqueIndex++;
            arr[uniqueIndex] = arr[j];
            return removeDuplicatesRecursive(arr, uniqueIndex, ++j);
        }else return removeDuplicatesRecursive(arr, uniqueIndex, ++j);

    }

    public int binarySearchInteger(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int mid = 0; 
        while(left <= right){
            mid = left + (right - left) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;

    }
    public String LongestWordInSentence(String Sentence){
        StringBuilder wordBuilt = new StringBuilder();
        ArrayList<String> words = new ArrayList<>();
        for (char c  : Sentence.toCharArray()) {
            if(c == ' '){
                words.add(wordBuilt.toString());
                wordBuilt.setLength(0);;
            }else wordBuilt.append(c);
        }
        words.add(wordBuilt.toString());
        String longestWord = words.get(0);
        for (String word : words) {
            if(word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return "Longest word is: " + longestWord;
    }

    public String ReverseSentence(String sentence){
        StringBuilder wordBuilt = new StringBuilder();
        ArrayList<String> words = new ArrayList<>();
        for (char c  : sentence.toCharArray()) {
            if(c == ' '){
                words.add(wordBuilt.toString());
                wordBuilt.setLength(0);;
            }else wordBuilt.append(c);
        }
        words.add(wordBuilt.toString());

        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            if(i == 0){
                reversedSentence.append(words.get(i));
            }
            else{
                reversedSentence.append(words.get(i) + " ");
            }
        }
        return reversedSentence.toString();
    }




}
