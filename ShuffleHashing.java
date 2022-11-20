package CodeForces_Solution;

import java.util.*;
import java.io.*;

public class ShuffleHashing {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    public static void main(String[] args) {
        try {
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();
            int t = in.nextInt();
            while (t-- > 0) {
                String s1 = in.next();
                String s2 = in.next();
                if(s1.length()>s2.length()){
                    out.println("NO");
                    continue;
                }
                int n = s2.length() - s1.length();
                if(solve(s1,s2,n)){
                    out.println("YES");
                }else{
                    out.println("NO");
                }
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
    static boolean solve(String s1, String s2, int n){
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        for(int i = 0; i<=n; i++){
            String sub2 = s2.substring(i,s1.length()+i);
            char[] ch2 = sub2.toCharArray();
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)){
                return true;
            }
        }
        return false;
    }
}
