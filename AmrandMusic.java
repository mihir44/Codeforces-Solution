package CodeForces_Solution;

import java.util.*;
import java.io.*;

public class AmrandMusic {
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
            int k = in.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] =in.nextInt();
            }
            int a[] = arr.clone();
            Arrays.sort(a);
            ArrayList<Integer> ans = new ArrayList<Integer>();
            //boolean vis[] = new int[n];
            for(int x : a){
                if(k < x)
                    break;
                else
                    k -= x;

                for(int i=0;i<n;i++){
                    if(arr[i] == x){
                        ans.add(i+1);
                        arr[i] = -1;
                        break;
                    }
                }
                out.println(ans.size());
                for(int x : ans){
                    out.print(x+" ");
                }
                out.println();
            }
        } catch (Exception e) {
            return;
        }

    }
}
