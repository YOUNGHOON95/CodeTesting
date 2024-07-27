package programers.practice;

public class Day75 {
	/*
	 * 문제 설명
		문자열 myString이 주어집니다. myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 return 하는 solution 함수를 완성하세요.
		
		입출력 예
			myString				result
			"abstract algebra"		"AbstrAct AlgebrA"
			"PrOgRaMmErS"			"progrAmmers"
		입출력 예 #1
			0번, 5번, 9번, 15번 인덱스의 "a"는 소문자이므로 전부 대문자로 고쳐줍니다.
			다른 문자들은 전부 "a"가 아닌 소문자이므로 바꾸지 않습니다.
			따라서 "AbstrAct AlgebrA"를 return 합니다.
		입출력 예 #2
			0번, 2번, 4번, 6번, 8번, 10번 인덱스의 문자들은 "A"가 아닌 대문자이므로 전부 소문자로 고쳐줍니다.
			5번 인덱스의 "a"는 소문자이므로 대문자로 고쳐줍니다.
			다른 문자들은 전부 "a"가 아닌 소문자이므로 바꾸지 않습니다.
			따라서 "progrAmmers"를 return 합니다.
		=>1. myString 문자열에서 a일때 대문자A로 변환 해주고 나머지는 전부 소문자로 변환 해주려고 반복문과 if문을 생각했다 
		=>전혀 다른 풀이에 생각지도 못했다
	 */
    public String main(String myString) {
        String answer = "";
        //for(int i = 0; i<myString.length(); i++){
        //    if(charAt(i) == "a"){
                //대문자
        //       answer = myString.toUpperCase();
        //    }else{
                //소문자
        //        answer = myString.toLowerCase();
        //    }
        //}
        myString = myString.toLowerCase();
        answer = myString.replaceAll("a", "A");
        return answer;
    }
}