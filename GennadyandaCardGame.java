package CodeForces_Solution;

import java.util.Scanner;

public class GennadyandaCardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] cards = new String[5];
        boolean print = false;
        for(int i = 0; i<5; i++){
            cards[i] = sc.next();
            if(cards[i].charAt(0) == s.charAt(0) || cards[i].charAt(1) == s.charAt(1)){
                print = true;
            }
        }
        if(print){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
