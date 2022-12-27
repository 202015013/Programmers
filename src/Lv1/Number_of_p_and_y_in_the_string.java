package Lv1;

public class Number_of_p_and_y_in_the_string {
    boolean solution(String s) {
        boolean answer = true;
        int countOfP = 0;
        int countOfY = 0;
        for (int x = 0; x < s.length(); x++) {
            if (s.charAt(x) == 'p' || s.charAt(x) == 'P') {
                countOfP++;
            }
            else if (s.charAt(x) == 'y' || s.charAt(x) == 'Y') {
                countOfY++;
            }
        }
        if (countOfP != countOfY) {
            answer = false;
        }

        return answer;
    }
}
