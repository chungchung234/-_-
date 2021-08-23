
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
        //xor 연산
        for(char x : str.toCharArray()){
            answer+=(char)(x^32);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int input2 = in.nextInt();
        System.out.println(input1 + input2);
        return ;
      }
}