package backtrackingEx;
// 1 ~ 10000 이하의 생성자가 없는 수를 구하는 것
// boolean 배열을 선언하여 셀프 넘버를 구분 배열의 길이는 10001
public class SelfNum {

    public static void main(String[] args) {
        boolean [] check = new boolean[10001];

        for(int i = 1; i < 10001; i++){
            int n = d(i);

            if(n < 10001){
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < 10001; i++){
            if(!check[i]){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int d(int number){
        int sum = number;

        while(number != 0){
            sum = sum + (number%10); //첫째자리수
            number = number /10; // 10을 나누어 첫번째 자리를 없앤다.
        }

        return sum;
    }
}
