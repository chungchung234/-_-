//중복문자 제거

import java.util.*;

class Main {
    public String solution(String str) {
        String answer="";
        int i=0;
        for(char c: str.toCharArray()){
            if(answer.indexOf(c)==-1)
                answer+=c;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}