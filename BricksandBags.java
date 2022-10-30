package CodeForces_Solution;

import java.util.*;

public class BricksandBags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int ans = 0;
            for(int i = 0; i<n-2; i++){
                ans = Math.max(ans, arr[i+1] - arr[i] + arr[n-1] - arr[i]);
            }
            for(int i = n-1; i>=2; i--){
                ans = Math.max(ans, arr[i] - arr[i-1] + arr[i] - arr[0]);
            }
            System.out.println(ans);
        }
    }
}
