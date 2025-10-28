package DataStruct.Exersices1;
public class Exercise5A { // Given a String s, char c, int l. Return true if c is within the length of L recursively
    public static void main(String[] args) {
        System.out.println(linear("Tehtøityuieadsaest", 'ø', 14));
    }
    static boolean linear(String s, char c, int l){
        if(l <= 0){
            return false;
        }
        if(Character.toLowerCase(s.charAt(0)) == Character.toLowerCase(c)){
            return true;
        }else{
            return linear(s.substring(1), c, --l);
        }
    }
}
