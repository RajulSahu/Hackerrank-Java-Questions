import java.io.*;
import java.math.*;
import java.util.*;



public class Solution {
    
    static boolean checkPrime(BigInteger num){
        return num.isProbablePrime(100) ? true : false;
    }
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       BigInteger n = sc.nextBigInteger();
       boolean ans = checkPrime(n);
       if(ans){
           System.out.println("prime");
       }
       else{
           System.out.println("not prime");
       }
    }
}
