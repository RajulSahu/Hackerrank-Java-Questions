import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
        //Write your code here
        String temp;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - (i+1); j++){
                BigDecimal num1 = new BigDecimal(s[j]);
                BigDecimal num2 = new BigDecimal(s[j+1]);
                if (num1.compareTo(num2) < 0){
                    temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}