import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();
        
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            myList.add(sc.nextInt());
        }
        
        int q = sc.nextInt();
        
        for(int j = 0; j < q; j++){
            String op = sc.next();
            if(op.equals("Insert")){
                int index = sc.nextInt();
                int num = sc.nextInt();
                myList.add(index, num);
            }
            else if(op.equals("Delete")){
                int index = sc.nextInt();
                myList.remove(index);
            }
        }
        for(int ans: myList){
            System.out.print(ans + " ");
        }
        
    }
}