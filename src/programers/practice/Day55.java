package programers.practice;

import java.util.ArrayList;

public class Day55 {
	/*
	 * 문제 설명
		정수 n과 정수 3개가 담긴 리스트 slicer 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다. 
		slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.
		
		n = 1 : num_list의 0번 인덱스부터 b번 인덱스까지
		n = 2 : num_list의 a번 인덱스부터 마지막 인덱스까지
		n = 3 : num_list의 a번 인덱스부터 b번 인덱스까지
		n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
		올바르게 슬라이싱한 리스트를 return 하도록 solution 함수를 완성해주세요.
		
		입출력 예
			n	slicer		num_list					result
			3	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	[2, 3, 4, 5, 6]
			4	[1, 5, 2]	[1, 2, 3, 4, 5, 6, 7, 8, 9]	[2, 4, 6]
		
		입출력 예 #1
		[1, 2, 3, 4, 5, 6, 7, 8, 9]에서 1번 인덱스부터 5번 인덱스까지 자른 리스트는 [2, 3, 4, 5, 6]입니다.
		
		입출력 예 #2
		[1, 2, 3, 4, 5, 6, 7, 8, 9]에서 1번 인덱스부터 5번 인덱스까지 2개 간격으로 자른 리스트는 [2, 4, 6]입니다.
		
		
		=>if/case문으로 n일때 로직을 만든다 , 그 케이스 마다 자르는 리스트를 만든다
	 */

    public ArrayList<Integer> solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        ArrayList<Integer> answer = new ArrayList<>();
        switch (n){
            case 1:
                for (int i = 0; i <= b; i++){
                    answer.add(num_list[i]);
                }
                break;
            case 2:
                for (int i = a; i < num_list.length; i++){
                    answer.add(num_list[i]);
                }
                break;
            case 3:
                for (int i = a; i <= b; i++){
                    answer.add(num_list[i]);
                }
                break;
            case 4:
                for (int i = a; i <= b; i++){
                    answer.add(num_list[i]);
                    i++;
                }
                break;
        }
        return answer;
    }
}