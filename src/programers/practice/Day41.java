package programers.practice;

public class Day41 {
	/*
	 * 문제 설명
		길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다. 
		parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다. 
		각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
		
		입출력 예 설명
			입출력 예 #1
			
			예제 1번의 입력을 보기 좋게 표로 나타내면 다음과 같습니다.
			
			i	my_strings[i]		parts[i]	부분 문자열
			0	"progressive"		[0, 4]		"progr"
			1	"hamburger"			[1, 2]		"am"
			2	"hammer"			[3, 5]		"mer"
			3	"ahocorasick"		[7, 7]		"s"
			
			각 부분 문자열을 순서대로 이어 붙인 문자열은 "programmers"입니다. 따라서 "programmers"를 return 합니다.
	 */
    public String main(String[] my_strings, int[][] parts) {
        String answer = "";
        //substring으로 부분 자르기
        for(int i=0; i<my_strings.length; i++){
            String str = my_strings[i];
            
            answer += str.substring(parts[i][0], parts[i][1]+1);
        }
        
        return answer;
    }
}