package JavaTest;
import java.util.Stack;

public class paranthesis {
    public static void main(String[] args) {
        String s = "(])";
        String s2 = "(]";
        String s3 = "([])";
        System.out.println(isValid(s2));
    
    }
    
    static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == ')' && stack.contains('(')){
                if(stack.peek().equals('(')){
                    stack.pop();
                }
            }
            else if(c == ']' && stack.contains('[')){
                if(stack.peek().equals('[') ){
                    stack.pop();
                }
            }
            else if(c == '}' && stack.contains('{')){
                if(stack.peek().equals('{')){
                    stack.pop();
                }
            }
            else if (c == '(' && c == '(' && c == '(') {
                stack.push(c);
            }else if ((c == ')' || c == ']' || c == '}')){
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
