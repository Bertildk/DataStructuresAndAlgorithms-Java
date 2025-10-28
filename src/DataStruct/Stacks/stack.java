package DataStruct.Stacks;
import java.util.*;

public class stack {
    public static void main(String[] args) {
        System.out.println(balPar("(())))))")); //false
        System.out.println(balPar2("[{](())}]")); // false
        System.out.println(balPar2("(([{(())}]))")); // True

    }

    static boolean balPar(String text){
        Stack<Character> stack = new Stack<>();
        for(char c: text.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean balPar2(String text){
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> IsMatching = new HashMap(); //Hashmap Key, value
        IsMatching.put(')', '(');
        IsMatching.put(']', '[');
        IsMatching.put('}', '{');
        
        for(char c: text.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            if(c == ')' || c == ']' || c == '}'){
                if(!stack.isEmpty() && stack.peek() == IsMatching.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }


        return stack.isEmpty();

    }


}
