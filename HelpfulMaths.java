package CodeForces_Solution;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] splited = s.split("\\+");
        int n = splited.length;
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(splited[i]);
        }
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        for(int i: nums){
            sb.append(i);
            sb.append("+");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}
