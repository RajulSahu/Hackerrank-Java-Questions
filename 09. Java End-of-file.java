import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       int c = 1;
       Scanner sc = new Scanner(System.in);
       while(sc.hasNext()){
           String s = sc.nextLine();
           System.out.println(c + " " + s);
           c++;
       }
       
    }
}