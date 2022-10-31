package CodeForces_Solution;

import java.util.*;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        while (n != 0) {
            if(n % 10 == 7 || n % 10 == 4){
                count++;
            }
            n = n / 10;
        }
        if(count == 7 || count == 4)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
