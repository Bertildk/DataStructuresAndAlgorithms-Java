package Portfolio1;

public class task10 {
    public static void main(String[] args) {
        System.out.println(logTo(4096));
        System.out.println(logTo(16777216));
    }
    private static int logTo(int n){
        if(n == 1) return 0;
        return 1 + logTo(n/2);
    }
}
