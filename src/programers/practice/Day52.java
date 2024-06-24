package programers.practice;
import java.util.*;

public class Day52 {
	/*
	 * 문제 설명
		문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 
		이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
		
		입출력 예
			my_string				indices							result
			"apporoograpemmemprs"	[1, 16, 6, 15, 0, 10, 11, 3]	"programmer
			
		입출력 예 #1
			예제 1번의 my_string의 인덱스가 잘 보이도록 표를 만들면 다음과 같습니다.
			
			index		0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18
			my_string	a	p	p	o	r	o	o	g	r	a	p	e	m	m	e	m	p	r	s
			=>indices에 있는 인덱스의 글자들을 지우고 이어붙이면 "programmers"가 되므로 이를 return 합니다.
			
		-> indices를 먼저 정렬을 할 생각 못했고.. answer에다가 반복문 안에 문자 하나씩 넣는다(charAt())은 생각했지만 조건 하나를 생각은 못했다...
	 */
    public String main(String my_string, int[] indices) {
        String answer = "";
        int j=0;
        Arrays.sort(indices);

        for(int i=0;i<my_string.length();i++){
            if(j<indices.length && i==indices[j] ){
                j++;
            }else{
                answer += my_string.charAt(i);
            }

        }

        return answer;
    }
}
