
import java.util.*;

class Main {
    public int[] solution(String str, String t) {
        String rev = "";
        int num = 0;
        int len = str.length();
        int[] answer;
        List<Integer> index;
        for (int i; i < len; i++) {
            if (str.charAt(i) == t.charAt(0)) {
                index.add(i);
            }
        }
        for (int i : index) {
            num = 0;
            for (; i < len; i++) {
                answer[i] = num + 1;
            }
        }
        StringBuilder tmp = new StringBuilder(str).reverse();
        str = tmp.toString();
        index.clear();
        for (int i; i < len; i++) {
            if (str.charAt(i) == t.charAt(0)) {
                index.add(i);
            }
        }

        for (int i : index) {
            num = 0;
            for (; i < len; i++) {
                if (answer[i] > num)
                    answer[i] = num + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        String t = kb.next();
        System.out.print(T.solution(str, t));

    }
}