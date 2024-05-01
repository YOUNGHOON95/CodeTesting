package programers.practice;
import java.util.Scanner;

public class Day8 {
	/*
	 * 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is
	 * even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
	 * 
	 * 입력 #1 100
	 * 출력 #1 100 is even
	 * 
	 * 입력 #2 1
	 * 출력 #2 1 is odd
	 * 
	 * => 홀수 짝수 규칙만 알면 if문으로 분기 태운다 처음에는 2n+1로 조건식을 가져갔지만  
	 * 	  아닌것 같아서 고민중에 나머지 구하는 식이 떠올라 수정해봤다
	 * 
	 * ### 삼항연산자 풀이 참고...!!
	 */

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if( n % 2 == 1){
            //짝수
             System.out.println(n + " is odd");
        }else{
            //홀수
            System.out.println(n + " is even");
        }
        
    }

}
