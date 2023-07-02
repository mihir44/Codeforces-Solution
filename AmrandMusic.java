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
            int[] nums = new int[n];
            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                nums[i] = in.nextInt();
                arr[i] = nums[i];
            }

            Arrays.sort(nums);
            int count = 0;
            long sum = 0;
            ArrayList<Integer> res = new ArrayList<>();
            for(int i = 0; i<n; i++){
                sum += nums[i];
                if(sum>k){
                    break;
                }
                res.add(nums[i]);
                count++;
            }
            out.println(count);
            for(int i = 0; i<res.size(); i++){
                out.print(getIndex(res.get(i), arr) + " ");
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
    static int getIndex(int t, int[]arr){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == t){
                arr[i] = -1;
                return i+1;
            }
        }
        return -1;
    }
}
