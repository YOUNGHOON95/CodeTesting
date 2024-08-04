package programers.practice;

public class Day82 {
	/*
	 * 문제 설명
		문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
		
	   입출력 예
			myString		pat		result
			"banana"		"ana"	2
			"aaaa"			"aa"	3
		입출력 예 #1
			"banana"에서 1 ~ 3번 인덱스에서 한 번, 3 ~ 5번 인덱스에서 또 한 번 "ana"가 등장해서 총 두 번 등장합니다. 따라서 2를 return 합니다.
		입출력 예 #2
			"aaaa"에서 0 ~ 2번 인덱스에서 한 번, 1 ~ 3번 인덱스에서 한 번, 2 ~ 4번 인덱스에서 한 번 "aa"가 등장해서 총 세 번 등장합니다. 따라서 3을 return 합니다.
		
		=>1.indexOf로 myString 처음 발견되는 인덱스를 찾는다 2.indexOf가 -1을 반환할 때까지 이 과정을 반복, -1이 반환되면 pat이 더 이상 발견되지 않았음을 의미하므로, 반복을 종료
	 */
    public int main(String myString, String pat) {
        int answer = 0;
        int idx = 0;
        while ((idx = myString.indexOf(pat, idx)) != -1) {
            idx += 1; //idx += 1은 indexOf 메서드를 사용하여 찾은 인덱스 이후의 위치에서부터 다음 검색을 시작하기 위한 작업입니다.
            answer++; //패턴이 발견될 때마다 answer를 1 증가시켜 해당 패턴의 출현 횟수를 기록합니다.
        }
        return answer;
    }
}
