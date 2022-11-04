package CodeForces_Solution;

import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = n%10 -1;
            int digits = (int)(Math.floor(Math.log10(n) + 1));
            int res = 0;
            for(int i = 1; i<=4; i++){
                res += i*k;
            }
            for(int i = 1; i<=digits; i++){
                res += i;
            }
            sb.append(res + "\n");
        }
        System.out.println(sb.toString());
    }
}
