import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = 0;
            for(int j = 0; j<n; j++){
                if(s==0){
                    s = a + (int)(Math.pow(2, j) * b);
                }
                else{
                    s += (int)(Math.pow(2, j) * b);
                }
                
                System.out.print(s + " ");
                
            }
            System.out.println();
    }
}
}