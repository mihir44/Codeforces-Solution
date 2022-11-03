package CodeForces_Solution;

import java.util.Scanner;

public class CPlusEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int count = 0;
            while(a<=n && b<=n){
                if(a<b){
                    a += b;
                }else{
                    b+=a;
                }
                count++;
            }
            sb.append(count + "\n");
        }
        System.out.println(sb.toString());
    }
}
