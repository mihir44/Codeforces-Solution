package CodeForces_Solution;

import java.util.Scanner;

public class SoldierandBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int total = 0;
        for(int i = 0; i<=w; i++){
            total += k*i;
        }
        int res = total-n;
        if(res>0)
            System.out.println(res);
        else
            System.out.println(0);
    }
}
