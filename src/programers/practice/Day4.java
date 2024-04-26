package programers.practice;

import java.util.Scanner;

public class Day4 {

	/*
	 * 
	 * 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
	 * 
	 * 입력 aBcDeFg
	 * 출력 AbCdEfG
	 * 
	 * =>대소문자 변환 함수가 있는걸로 안다(찾아봄) / 입력된 문자열 for문으로 대소문자 확인 후 변환 / isUpperCase 대소문자를 비교해줌
	 *  
	 */

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        String answer = "";
        
        for(int i = 0 ; i < a.length(); i++){
            b = a.charAt(i);
            
            //대소문자 비교 후 변환
            if(Character.isUpperCase(b)){
                answer += Character.toLowerCase(b);
            }else{
                answer += Character.toUpperCase(b);
            }

        }
        System.out.println(answer);

    }
}
