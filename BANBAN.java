package CodeForces_Solution;

import java.util.Scanner;

public class BANBAN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-->0){
            int n = sc.nextInt();
            sb.append((n+1)/2 + "\n");
            int i = 1;
            int j = (3*n)-1;
            while(i<j){
                sb.append(i + " " + j + "\n");
                i += 3;
                j -= 3;
            }
        }
        System.out.println(sb.toString());
    }
}
