package CodeForces_Solution;

import java.util.*;
import java.io.*;

public class Game23 {
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
            long n = in.nextLong();
            long m = in.nextLong();
            if(m%n != 0){
                out.print(-1);
            }else{
                out.print(countFactor(m/n));
            }
            out.close();
        } catch (Exception e) {
            return;
        }

    }

    private static int countFactor(long n) {
        int count = 0;
        while(n>1){
            if(n%2 == 0){
                count++;
                n/=2;
            }else if(n%3 == 0){
                count++;
                n /=3;
            }else{
                return -1;
            }
        }
        return count;
    }
}
