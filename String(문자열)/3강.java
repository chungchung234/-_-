
import java.util.*;

class Main{
    public String solution(String str){
        String answer="";
        //함수활용
        // for(char x : str.toCharArray()){
        //     if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
        //   	else answer+=Character.toLowerCase(x);
        // }
        //ascii 값활용
        // for(char x : str.toCharArray()){
        //     if(x>65&&x<92)answer+=(char)(x+32);
        //     else answer+=(char)(x-32);
        // }
        for(char x : str.toCharArray()){
            answer+=(char)(x^32);
        }
        return answer;
    }

public static void main(String[] args){
    Main T= new Main();
    Scanner kb = new Scanner(System.in);

    String str=kb.next();
     System.out.print(T.solution(str));
    }
}