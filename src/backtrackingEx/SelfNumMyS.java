package backtrackingEx;

public class SelfNumMyS {
    static boolean[] check = new boolean[10001];
    static StringBuilder sb = new StringBuilder();

    static void input() {
        for (int i = 1; i < 10001; i++) {
            int n = calculator(i);

            if (n < 10001) {
                check[n] = true;
            }
        }
    }

    static void check(boolean[] check) {

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {
                sb.append(i).append('\n');
            }
        }
    }

    static int calculator(int number) {
        int sum = number;

        while (number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        input();
        check(check);
        System.out.println(sb);
    }
}
