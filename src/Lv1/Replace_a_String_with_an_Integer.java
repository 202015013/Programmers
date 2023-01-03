package Lv1;

public class Replace_a_String_with_an_Integer {
    public int solution(String s) {
        int answer = 0;
        if (s.indexOf(0) == '-') {
            answer = Integer.valueOf(s.substring(1,s.length()+1));
        }
        else {
            answer = Integer.valueOf(s);
        }
        return answer;
    }
}
