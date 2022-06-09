package bruteforceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//등차수열 -> 한수 -> N이 주어짐 1<= x <=N x의 개수 출력
public class OneNum {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static int sequence(int num){
        int cnt = 0;
        if(num < 100){
            return num;
        }else{
            cnt =99;
            for(int i = 100; i <= num; i++){
                int hun = i /100;
                int ten = (i /10) % 10;
                int one = i %10;

                if((hun -ten) == (ten - one)){
                    cnt ++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(sequence(Integer.parseInt(br.readLine())));
    }
}
