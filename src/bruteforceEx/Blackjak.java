package bruteforceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Blackjak {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void input() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        logic(arr, N, M);
    }

    public static void logic(int[] arr, int N, int M) {
        int tmp =0;
        for (int i = 0; i < N-2; i++) {
            for (int j = i + 1; j < N-1; j++) {
                for (int h = j + 1; h < N; h++) {
                    int sum = (arr[i] + arr[j] + arr[h]);
                    if(sum == M) tmp = sum;
                    else if(sum > M) continue;
                    else{
                        if(tmp < sum) tmp = sum;
                    }
                }
            }
        }
        sb.append(tmp);
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(sb);
    }
}
