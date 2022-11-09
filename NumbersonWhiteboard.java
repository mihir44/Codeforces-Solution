package CodeForces_Solution;

import java.util.*;
import java.io.*;

public class NumbersonWhiteboard {
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
                int n = in.nextInt();
                PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> b-a);
                for(int i = 1; i<=n; i++){
                    pq.offer(i);
                }
                out.println(2);
                while(pq.size()>1){
                    int num1 = pq.poll();
                    out.print(num1 + " ");
                    int num2 = pq.poll();
                    out.println(num2);
                    int addNum = (num1 + num2 + 1)/2;
                    pq.offer(addNum);
                }
            }
            out.close();
        } catch (Exception e) {
            return;
        }

    }
}
