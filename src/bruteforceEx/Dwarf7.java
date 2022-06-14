package bruteforceEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dwarf7 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    public static void input() throws IOException{
        int [] arr =new int[9];
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        solution(arr);
    }


    public static void main(String[] args) throws IOException {

    }
}
