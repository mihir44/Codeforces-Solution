package CodeForces_Solution;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char first = Character.toUpperCase(word.charAt(0));
        String res = first + word.substring(1);
        System.out.println(res);
    }
}
