package bruteforceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class Chess {
    public static boolean[][] arr;
    static int N, M;
    public static int min = 64;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                }
                arr[i][j] = false;
            }
        }

        int NRow = N-7;
        int MCol = M-7;
        for(int i = 0; i < NRow; i++){
            for(int j = 0; j < MCol; j++){
              find(i,j);
            }
        }
    }

    public static void find(int x, int y){
        int endX = x+8;
        int endY = y+8;
        int count =0;

        boolean TF = arr[x][y];

        for(int i = x; i < endX; i++){
            for(int j = y; j < endY; j++){
                if(arr[i][j] != TF){
                    count++;
                }

                TF = (!TF);
            }
            TF = !TF;
        }
        count = Math.min(count, 64 - count);
        min = Math.min(min,count);
    }


    public static void main(String[] args) throws IOException {
        input();
        System.out.println(min);
    }
}
