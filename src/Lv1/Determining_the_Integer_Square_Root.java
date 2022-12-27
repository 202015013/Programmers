package Lv1;

public class Determining_the_Integer_Square_Root {
    public long solution(long n) {
        Double sqrt = Math.sqrt(n);

        if (sqrt == sqrt.intValue()) {
            return (long) Math.pow(sqrt + 1, 2);
        } else return -1;
    }
}
