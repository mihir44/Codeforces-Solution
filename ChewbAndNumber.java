package CodeForces_Solution;

import java.util.*;

public class ChewbAndNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] ch = n.toCharArray();
        for(int i = 0; i<n.length(); i++){
            if(i == 0 && ch[i] == '9'){
                continue;
            }

            if(ch[i] >= '5'){
                ch[i] = (char)('9'-ch[i] + 48);
            }
        }
        System.out.println(new String(ch));
    }
}
