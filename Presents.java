package CodeForces_Solution;

import java.util.*;

public class Presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i = 1; i<=n; i++){
            arr[i] = sc.nextInt();
        }
        int res[] = new int[n+1];
        for(int i = 1; i<=n; i++){
            res[arr[i]] = i;
        }
        for(int i = 1; i<=n; i++){
            System.out.print(res[i] + " ");
        }
    }
}
