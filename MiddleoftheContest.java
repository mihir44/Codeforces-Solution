package CodeForces_Solution;

import java.util.*;
import java.io.*;

public class MiddleoftheContest {
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
            String t1 = in.next();
            String t2 = in.next();
            int s = Integer.parseInt(t1.substring(0,2)) * 60 + Integer.parseInt(t1.substring(3, 5));
            int e= Integer.parseInt(t2.substring(0,2)) * 60 + Integer.parseInt(t2.substring(3, 5));
            int m = (e-s)/2;
            s += m;
            out.println((s/60<10 ? "0"+String.valueOf(s/60): String.valueOf(s/60)) + ":" +
                    (s%60<10 ? "0" +String.valueOf(s%60): String.valueOf(s%60)));
            out.close();
        } catch (Exception e) {
            return;
        }

    }
}
