import java.util.*;

class Main {
    public String solution(String str) {
        String answer="YES";
		str.toUpperCase();
      	Stack<String> st = new Stack<String>();
      	for(char c:str.toCharArray()){
         	 st.push(String.valueOf(c));
        }
        for(char c:str.toCharArray()){
         	 if(st.pop()!=String.valueOf(c))answer="NO";
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