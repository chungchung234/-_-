//팬린드롬
//시간 115ms
import java.util.*;

class Main {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        for (int i = 0; i < str.length() / 2; i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i))

                answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));

    }
}