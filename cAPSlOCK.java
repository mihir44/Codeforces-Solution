package CodeForces_Solution;

import java.util.*;
import java.io.*;

public class cAPSlOCK {
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
            String s = in.next();
            int k = 0;
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') k++;
            if (k == s.length()) {
                out.println(s.toLowerCase());
                out.close();
                return;
            } else
            if (k == s.length() - 1 && s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
                out.println(s.substring(0, 1).toUpperCase() + s.substring(1, s.length()).toLowerCase());
                out.close();
                return;
            }
            out.println(s);
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
