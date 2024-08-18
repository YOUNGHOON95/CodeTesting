package programers.practice;

public class Day94 {
	/*
	 * 문제 설명
		문자열 배열 strArr이 주어집니다. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
		
	   입출력 예
		strArr						result
		["a","bc","d","efg","hi"]	2
		
	   각 문자열들을 길이에 맞게 그룹으로 묶으면 다음과 같습니다.
		문자열 길이		문자열 목록			개수
		1			["a","d"]		2
		2			["bc","hi"]		2
		3			["efg"]			1
		개수의 최댓값은 2이므로 2를 return 합니다.
		
	=> 1.처음에는 배열안에 있는 문자를 묶을 생각을 했는데 갯수로 접근하는 방법이 있었다
	 */
    public int main(String[] strArr) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<=30; i++){
            count=0;
            for(int j=0; j<strArr.length; j++){
                if(i==strArr[j].length()){
                    count ++;
                }
                if(answer<count){
                    answer=count;
                }
            }
        }
        return answer;
    }
}