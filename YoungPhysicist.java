package CodeForces;

import java.util.*;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int xsum = 0;
        int ysum = 0;
        int zsum = 0;
        while(n-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            xsum += x;
            ysum += y;
            zsum += z;
        }
        if(xsum == 0 && ysum == 0  && zsum == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
