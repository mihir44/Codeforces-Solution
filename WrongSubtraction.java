package CodeForces_Solution;

import java.util.*;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        while(k-->0){
            if(n == 0){
                break;
            }
            if(n%10 == 0){
                n = n/10;
            }else{
                n--;
            }
        }
        System.out.println(n);
    }
}
