package fullsearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SeqAdd {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static void input()throws IOException{
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        nums = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
    }

    static int N, S, ans;
    static int[] nums;
    // k 번째 원소를 포함시킬지 고르는 함수
    // value := k-1 번째 원소까지 골라진 원소들의 합
    static void recFunc(int k, int value){
        if (k==N+1) {// 부분 수열 하나 완성시킨 형태
            // value가 s 랑 같은지 확인하기
            if(value == S){
                ans++;
            }
        }
        else{
            //k번째 원소를 포함시킹지 정하고 재귀 호출
            // 포함
            recFunc(k+1,value+nums[k]);
            // 미포함
            recFunc(k+1, value);
        }
    }


    public static void main(String[] args) throws IOException {
        input();
        recFunc(1,0);
        if(S == 0){
            ans--;
        }
        System.out.println(ans);
    }
}
