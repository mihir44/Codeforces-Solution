package CodeForces_Solution;

import java.util.*;
import java.io.*;

public class StringTask {
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
            int n = s.length();
            StringBuilder sb = new StringBuilder();
            Set<Character> set = new HashSet<>();
            set.add('a');
            set.add('A');
            set.add('e');
            set.add('E');
            set.add('i');
            set.add('I');
            set.add('o');
            set.add('O');
            set.add('u');
            set.add('U');
            set.add('y');
            set.add('Y');
            for(int i = 0; i<n; i++){
                if(!set.contains(s.charAt(i))){
                    sb.append('.');
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
            }
            out.println(sb.toString());
            out.close();
        } catch (Exception e) {
            return;
        }

    }
}
