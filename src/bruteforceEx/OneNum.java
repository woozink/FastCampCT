package bruteforceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
/*
문제 접근

등차 수열이면 1000까지니까 100의 자리 수 10의 자리수 1의 자리수를 각각 구해가지구
백 - 텐 == 텐 - 일 한 수들만 cnt ++ 해주면 끝나는 로직.. !
 */