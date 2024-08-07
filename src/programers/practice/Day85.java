package programers.practice;

public class Day85 {
	/*
	 * 문제 설명
		문자열 binomial이 매개변수로 주어집니다. binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수, 
		op는 '+', '-', '*' 중 하나입니다. 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
		
		입출력 예
			binomial		result
			"43 + 12"		55
			"0 - 7777"		-7777
			"40000 * 40000"	1600000000
		입출력 예 #1
			예제 1번의 binomial은 "43 + 12"로 이 식을 계산한 결과인 43 + 12 = 55를 return 합니다.
		입출력 예 #2
			예제 2번의 binomial은 "0 - 7777"로 이 식을 계산한 결과인 0 - 7777 = -7777을 return 합니다.
		입출력 예 #3
			예제 3번의 binomial은 "40000 * 40000"으로 이 식을 계산한 결과인 40000 × 40000 = 1600000000을 return 합니다.
		
		=>1.문자열 binomial를 먼저 split으로 자르고("") 2.잘라진 문자열을 정수형int로 바꾸면서 나줘주고 3.연산자에 따라서 값을 구해준다
	 */
    public int main(String binomial) {
    String[] split = binomial.split(" ");

        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[2]);

        switch (split[1]) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            default: // "*"
                return a * b;
        }
    }
}
