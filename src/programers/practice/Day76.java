package programers.practice;

public class Day76 {
	/*
	 * 문제 설명
		영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때, 
		my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
		
		입출력 예
			my_string		alp		result
			"programmers"	"p"		"Programmers"
			"lowercase"		"x"		"lowercase"
		입출력 예 #1
			예제 1번의 my_string은 "programmers"이고 alp가 "p"이므로 my_string에 모든 p를 대문자인 P로 바꾼 문자열 "Programmers"를 return 합니다.
		입출력 예 #2
			예제 2번의 alp는 "x"이고 my_string에 x는 없습니다. 따라서 "lowercase"를 return 합니다.
			
		=>> 1.my_string 문자열에서 alp문자열을 찾는 반복문 2.alp를 찾았다면 alp일때 그 문자를 대문자로 바꿔주기..
	 */
    public String main(String my_string, String alp) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            String s = my_string.charAt(i) + "";
            if(s.equals(alp)){
                s = s.toUpperCase();
            }
            answer += s;
        }
        //answer = my_string.replaceAll(alp, alp.toUpperCase());

        return answer;
    }
}
