package bruteforceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decompose {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void input() throws IOException {
        int N = Integer.parseInt(br.readLine());
        int index = N;
        int res = 0;
        solution(N, index, res);
    }

    public static void solution(int N, int index, int res) {
        while (index > 0) {
            index--;
            int com = index;
            int unit = index;

            while (unit != 0) {
                com += unit % 10;
                unit /= 10;
            }
            if (com == N) res = index;
        }
        sb.append(res);
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(sb);
    }
}
// 245 분해합 = 256 (245 + 2+ 4+ 5)
// 198 = 198 + 1+9+8 =216