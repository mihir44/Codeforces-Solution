package CodeForces_Solution;

import java.util.*;

public class TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int arr[] = new int[n];
        int res = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        res = Math.abs(arr[0] - arr[1]) + Math.abs(arr[1] - arr[2]);
        System.out.println(res);
    }
}
