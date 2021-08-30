import java.util.*;
import java.io.*;

class Solution{
    
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input=sc.next();
            boolean ans = isValidParenthesis(input);
            System.out.println(ans);
        }
        
    }
    static boolean isValidParenthesis(String s){
        // ({()})
        int sLen = s.length();
        if(sLen == 0){
            return true;
        }
        char ch;
        Stack<Character> bracket = new Stack<Character>();
        for(int i = 0; i < sLen; i++){
            ch = s.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                bracket.push(ch);
            }
            else{
                if(bracket.size() == 0){
                    return false;
                }
                if(ch == '}' && bracket.peek() == '{'
                || ch == ']' && bracket.peek() == '['
                || ch == ')' && bracket.peek() == '('){
                    bracket.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(bracket.size() == 0){
            return true;
        }
        else{
            return false;
        }
    }
}



