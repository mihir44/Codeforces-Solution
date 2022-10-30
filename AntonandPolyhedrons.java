package CodeForces_Solution;

import java.util.*;

public class AntonandPolyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i = 0; i<n; i++){
            words[i] = sc.next();
        }
        Map<String, Integer> map = new HashMap<>();
        map.put("Icosahedron", 20);
        map.put("Tetrahedron", 4);
        map.put("Cube",6);
        map.put("Octahedron",8);
        map.put("Dodecahedron",12);
        long res = 0;
        for(String word: words){
            res += map.get(word);
        }
        System.out.println(res);
    }
}
