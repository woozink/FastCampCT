package bruteforceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bulk {
    static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[] range;
    static int[][] arr;

    public static void input()throws IOException{
        N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j = 0; j < 2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solution(N, arr);
    }

    public static void solution(int N, int[][]arr){
        int[] range= new int[N];
        for(int i = 0; i < N; i++){
            int count = 1;
            for(int j = 0; j<N; j++){
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) count++;
            }
            range[i] = count;
        }
        for(int i =0; i < N; i++){
            sb.append(range[i]).append('\n');
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(sb);
    }
}
