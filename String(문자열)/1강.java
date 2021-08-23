
import java.util.*;

class Main{
    public int solution(String str, char t){
        int answer=0;
        str= str.toUpperCase();
        t=Character.toUpperCase(t);
        // 일반 for문 
        //시간복잡도 126ms
        // for( int i=0; i<str.length(); i++){
        //     if(str.charAt(i)==t){
        //         answer++;
        //     }
        // }
        // for each문
        //시간복잡도 114ms
        for(char x : str.toCharArray()){
            if(x==t)answer++;
        }

        return answer;
    }

public static void main(String[] args){
    Main T= new Main();
    Scanner kb = new Scanner(System.in);

    String str=kb.next();
    char c = kb.next().charAt(0);
    System.out.print(T.solution(str, c));
    }
}