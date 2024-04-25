package programers.practice;

import java.util.Scanner;

public class Day3 {
	/*
	 * 
	 * 문자열 str과 정수 n이 주어집니다.
	 * str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
	 * 
	 * 
	 * 입력 string 5
	 * 출력 stringstringstringstringstring
	 * 
	 * => 반복되는 수... for문을 이용해봤습니다
	 */

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ;i++){
            System.out.print(str);
        }
    }

}
