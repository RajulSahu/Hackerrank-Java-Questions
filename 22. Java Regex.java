import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    
    static boolean validateIP(String ip){
        String ip_regex = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        
        Pattern p = Pattern.compile(ip_regex);
        Matcher m = p.matcher(ip);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            System.out.println(validateIP(sc.nextLine()));
        }
    }
}