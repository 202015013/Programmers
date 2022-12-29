package Lv1;

public class n_numbers_spaced_by_x {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for (int j = 1; j <= n; j++) {
            answer[j-1] = x*j;
        }
        return answer;
    }
}
