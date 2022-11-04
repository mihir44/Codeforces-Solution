package CodeForces_Solution;

import java.util.Scanner;

public class VanyaandCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        int prev = 0;
        int curr = 0;
        while(curr<=n){
            count++;
            curr += (int)(i*(i+1)/2);
            i++;
        }
        System.out.println(--count);
    }
}
