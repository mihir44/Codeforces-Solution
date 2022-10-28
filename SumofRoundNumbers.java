package CodeForces_Solution;

import java.util.*;

public class SumofRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            solve(n);
        }
    }
    private static void solve(int n){
        int num = 1;
        ArrayList<Integer> res = new ArrayList<>();
        int count = 0;
        while(n != 0){
            int last = n%10;
            last *= num;
            if(last != 0){
                count++;
                res.add(last);
            }
            num *= 10;
            n /= 10;
        }
        System.out.println(count);
        for(int i = 0; i<res.size(); i++){
            System.out.print(res.get(i) + " ");
        }
        System.out.println();
    }
}