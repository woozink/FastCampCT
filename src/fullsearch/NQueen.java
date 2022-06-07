package fullsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static void input() throws IOException {
        N = Integer.parseInt(br.readLine());
        col = new int[N+1];
    }

    static int N, ans;
    static int[] col;

    static boolean attackable(int r1, int c1, int r2, int c2){
        if(c1 == c2) return true;
        if(r1 - c1 == r2 - c2) return true;
        if(r1 + c1 == r2 + c2) return true;
        return false;
    }


    static void recFunc(int row){
        if(row == N+1){
            ans ++;
        }else{
            for(int c = 1; c <= N; c++){
                boolean possible = true;
                //valid check (row, c);
                for(int i = 1; i <= row -1; i++){
                    //(i, col[i])
                    if(attackable(row, c, i, col[i])){
                        possible = false;
                        break;
                    }
                }
                if(possible){
                    col[row] = c;
                    recFunc(row+1);
                    col[row] = 0;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        recFunc(1);
        System.out.println(ans);
    }
}
