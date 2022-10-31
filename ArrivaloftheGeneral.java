package CodeForces_Solution;

import java.util.*;

public class ArrivaloftheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxi = 0;
        int mini = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]> arr[maxi]){
                maxi = i;
            }
            if(arr[i]<=arr[mini]){
                mini = i;
            }
        }
        int res = maxi + (n-mini-1);
        if(maxi>mini){
            res--;
        }
        System.out.println(res);
    }
}
