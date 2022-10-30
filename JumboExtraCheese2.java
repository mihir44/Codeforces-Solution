package CodeForces_Solution;

import java.util.*;

public class JumboExtraCheese2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            long hori = 0;
            long vert = 0;
            for(int i = 0; i<n; i++){
                long a = sc.nextLong();
                long b = sc.nextLong();
                long maxi = Math.max(a,b);
                long mini = Math.min(a,b);
                hori += 2*mini;
                vert = Math.max(vert,maxi);
            }
            System.out.println(hori + (2*vert));
            t--;
        }

    }
}
