package Portfolio1;

public class task3 {
    public static void main(String[] args) {
        System.out.println(additive("82842605"));
    }
    // int int_val = (int) c - '0';
    // ASCII værdien af x - 0 er ligemed værdien af givne char som int. 
    private static boolean additive(String s){
        int A = (int) s.charAt(0) - '0';
        int B = (int) s.charAt(1) - '0';
        int C = (int) s.charAt(2) - '0';
        System.out.println(A + " " + B + " " + C + " ");
        if(A+B == C) return true;
        if (s.length() == 3){
            return false;
        }
        return additive(s.substring(1));
    }
}
