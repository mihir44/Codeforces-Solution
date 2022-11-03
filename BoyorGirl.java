package CodeForces_Solution;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyorGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int n = name.length();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            set.add(name.charAt(i));
        }
        if(set.size()%2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}
