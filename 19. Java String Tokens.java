import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        String[] arr = s.split("[!,?._'@\\s]+");
        System.out.println(Math.min(arr.length, s.length()));
        for(String value: arr){
            System.out.println(value);
        }
        scan.close();
    }
}
