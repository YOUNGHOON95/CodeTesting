package programers.practice;
import java.util.Scanner;

public class Day2 {
	/*
	 * 정수 a와 b가 주어집니다. 각 수를 입력받아 입출력 예와 같은 형식으로 출력하는 코드를 작성해 보세요.
	 * => 처음에는 이해가 안갔는데 혹시나 하는 생각에 출력방법인가 싶어서 작성하게 됨
	 * 입력  4 5
	 * 
	 * 출력  
	 * a = 4
	 * b = 5
	 * 
	 * => \n 줄바꿈도 있다는걸 알게 됨 
	 * 
	 */
	public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
