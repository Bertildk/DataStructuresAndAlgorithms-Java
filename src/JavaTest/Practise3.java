package JavaTest;
public class Practise3 {
    public static void main(String[] args) {
        int a = 2, b = 3;
        int answer = recursionPower(a, b);
        if(answer == 8){
            System.out.println("True");
        }else{
            System.out.println("FALSE");
        }
        System.out.println("-".repeat(40));
        a = 5;
        b = 0;
        answer = recursionPower(a, b);
        if(answer == 1){
            System.out.println("True");
        }else{
            System.out.println("FALSE");
        }
        System.out.println("-".repeat(40));

        a = 5;
        b = 3;
        answer = recursionPower(a, b);
        if(answer == 125){
             System.out.println("True");
        }else{
            System.out.println("FALSE");
        }
        
    }

    static int recursionPower(int a, int b){
        if (b == 0) return 1;

        return a*recursionPower(a, b-1);
    }
}
