package CodeForces_Solution;

import java.util.*;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr = 0;
        int max = 0;
        while(n--!=0){
            int arrive = sc.nextInt();
            int depart = sc.nextInt();
            curr-=arrive;
            curr+=depart;
            max = Math.max(curr,max);
        }
        System.out.println(max);
    }
}
