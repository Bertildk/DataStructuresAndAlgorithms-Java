package DataStruct.Exersices1;
public class Exercise2A {  // Case insensitive char counter in a String via recursion

    public static void main(String[] args) {
        String test = "Test";
        Character c = 'T';
        System.out.println(recursiveStringAndChar(test, c));
       
    }
    static int recursiveStringAndChar(String str, char c){
        if(str.length() <= 0){
            return 0;
        }
        if(Character.toLowerCase(str.charAt(0)) == Character.toLowerCase(c)){
            return 1+recursiveStringAndChar(str.substring(1), c);
        }else{
            return recursiveStringAndChar(str.substring(1), c);
        }
    }
}
