package CodeForces_Solution;

import java.util.*;
import java.io.*;

public class FixYou {
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
                int m = in.nextInt();
                String[] arr = new String[n];
                for(int i = 0; i<n; i++){
                    arr[i] = in.nextLine();
                }
                char[][] grid = new char[n][m];
                for(int i = 0; i<n; i++){
                    for(int j = 0; j<m; j++){
                        grid[i][j] = arr[i].charAt(j);
                    }
                }
                int count = 0;
                for(int i = 0; i<n; i++){
                    if(grid[i][m-1] == 'R'){
                        count++;
                        grid[i][m-1] = 'D';
                    }
                }
                for(int i = 0; i<m; i++){
                    if(grid[n-1][i] == 'D'){
                        count++;
                        grid[n-1][i] = 'R';
                    }
                }
                out.println(count);
            }
            out.close();
        } catch (Exception e) {
            return;
        }

    }
}
