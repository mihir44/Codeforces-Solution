package CodeForces_Solution;

import java.util.Arrays;
import java.util.Scanner;


public class TwoGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long sum = 0;
            for(int i = 0; i<n; i++){
                sum += arr[i];
            }
            sb.append(Math.abs(sum) + "\n");
        }
        System.out.println(sb.toString());
    }
}
