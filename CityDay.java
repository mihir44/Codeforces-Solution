package CodeForces_Solution;

import java.util.*;
import java.io.*;

public class CityDay {
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
            int n = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = in.nextInt();
            }

            for(int i = 0; i<n; i++){
                boolean before=true,after=true;
                for(int j = i-1; j>=i-x && j>=0; j--){
                    if(arr[j]<arr[i]) {
                        before = false;
                        break;
                    }
                }
                for(int j = i+1; j<n && j<=i+y; j++){
                    if(arr[j]<arr[i]){
                        after = false;
                        break;
                    }
                }
                if(before && after){
                    out.println(i+1);
                    break;
                }
            }
            out.close();
        } catch (Exception e) {
            return;
        }

    }
}
