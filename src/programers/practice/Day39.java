package programers.practice;

public class Day39 {
	/*
	 * 문제 설명
		문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다.
		 my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
		 
		 입출력 예
			my_string				queries									result
			"rermgorpsam"			[[2, 3], [0, 7], [5, 9], [6, 10]]		"programmers"
			
		=> 2차원 배열.... [2 , 3] index3번째 2번째 바꾸기 
		   바꾸기? temp.... 
	 */
    public String main(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        char temp;
        for(int j = 0; j < queries.length; j++){
            for(int i = queries[j][0]; i <= (queries[j][0]+queries[j][1]) / 2; i++) {
                temp = arr[i];
                arr[i] = arr[queries[j][0]+queries[j][1]-i];
                arr[queries[j][0]+queries[j][1]-i] = temp;
            }
        }
        return String.valueOf(arr);
    }
}
