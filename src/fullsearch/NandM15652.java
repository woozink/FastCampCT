package fullsearch;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NandM15652 {
    static StringBuilder sb = new StringBuilder();
    static int N,M;
    static int[] selected;

    static void input(){
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M+1];
    }



    static void recFunc(int k) {
        if(k == M+1){
            for(int i =1; i <=M; i++){
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
        }else{
            int start = selected[k-1];
            if(start == 0) start = 1;

            for(int i =start; i <= N; i++){
                selected[k] = i;
                recFunc(k+1);
                selected[k] = 0;
            }
        }
    }
    public static void main(String[] args) {
        input();
        recFunc(1);
        System.out.println(sb.toString());
    }


    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while (st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
}

