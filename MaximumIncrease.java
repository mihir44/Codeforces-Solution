package CodeForces_Solution;

import java.util.Scanner;

public class MaximumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int j = 1;
        int max = 1;
        int curr = 1;
        while(j<n){
            if(arr[j]>arr[j-1]) {
                curr++;
            }else{
                curr = 1;
            }
            j++;
            max = Math.max(max,curr);
        }
        System.out.println(max);
    }
}
