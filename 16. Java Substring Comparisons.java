import java.util.Scanner;

public class Substring {

    public static String getSmallestAndLargest(String s, int k) {
        String sub = s.substring(0, k);
        String smallest = sub;
        String largest = sub;
        for (int i = 1; i <= s.length()-k; i++) {
            sub = s.substring(i, i+k);
            if(sub.compareTo(smallest)<0){
                smallest = sub;
            }
            if(sub.compareTo(largest)>0){
                largest = sub;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}


