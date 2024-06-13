package programers.practice;

public class Day44 {
	/*
	 * 문제 설명
		어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 
		예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
		문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
		
		입출력 예
			my_string	is_suffix		result
			"banana"	"ana"			1
			"banana"	"nan"			0
			"banana"	"wxyz"			0
			"banana"	"abanana"		0
		
	 */
    public int main(String my_string, String is_suffix) {
        //my_string 문자열 , is_suffix 접미사
        //전에 풀었던 문제 기반으로 접미사를 구하고 비교하는 방식으로
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++){
            String str = my_string.substring(i,my_string.length());
            if(str.equals(is_suffix)){
                answer = 1;
            }
        }
        
        return answer;
    }
}