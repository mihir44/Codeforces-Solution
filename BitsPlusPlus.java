package CodeForces_Solution;

import java.util.*;

public class BitsPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while(n-- >0){
            String s = sc.next();
            if(s.charAt(1)  == '+'){
                ++res;
            }else{
                --res;
            }
        }
        System.out.println(res);
    }
}
