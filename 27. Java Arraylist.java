import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        
        int k;
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i = 0; i < n; i++){
            k = sc.nextInt();
            ArrayList<Integer> inner = new ArrayList<Integer>();
            for(int j = 0; j < k; j++){
                inner.add(sc.nextInt());
            }
            arr.add(inner);
        }
        int q = sc.nextInt();
        for(int m = 0; m < q; m++){
            int q1 = sc.nextInt();
            int q2 = sc.nextInt();
            if(q1>arr.size() || q2 > arr.get(q1-1).size()){
                System.out.println("ERROR!");
            }
            else{
                System.out.println(arr.get(q1-1).get(q2-1));
            }
        }
    }
}
