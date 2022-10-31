package CodeForces_Solution;

import java.util.*;

public class InSearchofanEasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isHard = false;
        while(n-->0){
            int a = sc.nextInt();
            if(a == 1){
                isHard = true;
            }
        }
        if(isHard){
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }
    }
}
