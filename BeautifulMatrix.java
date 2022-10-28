package CodeForces_Solution;

import java.util.*;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int m = 5;
        int[] mid = new int[]{2,2};
        int[][] mat = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int res = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(mat[i][j]==1){
                    res = Math.abs(mid[0]-i) + Math.abs(mid[1]-j);
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
