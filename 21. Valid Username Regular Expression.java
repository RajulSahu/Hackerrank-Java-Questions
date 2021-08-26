import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    
    static String checkUserName(String s){
        String exp = "^[a-zA-Z]\\w{7,29}$";
        if(s.matches(exp)){
            return "Valid";
        }
        else{
            return "Invalid";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str;
        String ans;
        for(int i=0; i<n; i++){
            str = sc.nextLine();
            ans = checkUserName(str);
            System.out.println(ans);
        }
        
    }
}
