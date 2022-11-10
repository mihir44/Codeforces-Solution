package CodeForces_Solution;

import java.util.*;
import java.io.*;

public class kString {
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
            int k = in.nextInt();
            String s = in.next();
            Map<Character, Integer> map = new HashMap<>();
            int n = s.length();
            for(int i = 0; i<n; i++){
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            }

            boolean flag = true;
            for(char key: map.keySet()){
                if(map.get(key)%k != 0){
                    out.println(-1);
                    flag = false;
                    break;
                }
            }
            if(flag){
                StringBuilder sb = new StringBuilder();
                for(char key: map.keySet()) {
                    for (int i = 0; i < map.get(key)/k; i++) {
                        sb.append(key);
                    }
                }
                s = sb.toString();
                for(int i = 1; i<k; i++){
                    sb.append(s);
                }
                out.print(sb.toString());
            }
            out.close();
        } catch (Exception e) {
            return;
        }

    }
}