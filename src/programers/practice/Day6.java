package programers.practice;
import java.util.Scanner;

public class Day6 {
	
	/*
	 * 
	 * 문자열 str이 주어집니다.
	 * 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
	 * a + b = c
	 * 
	 * 제한사항
	 * 1 ≤ str의 길이 ≤ 10
	 * 
	 * 입력 #1 abcde
	 * 
	 * 
	 * 출력 #1
	 * a
	 * b
	 * c
	 * d
	 * e
	 * 
	 * 
	 * =>반복문안에 문자열 자르는 substring을 이용해서 작성해봤습니다 
	 * 
	 */
	public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String c;

        if(a.length() >= 1 || a.length() <= 10){
            for(int i = 0 ; i < a.length() ; i++){
                b = a.charAt(i);
                c = a.substring(i,i+1);
                System.out.println(c);
            }
             
        }else{
            return ;
        }

    }

}
