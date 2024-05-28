package programers.practice;

import java.util.ArrayList;

public class Day31 {
	/*
	 * 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

		만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
		
		
		입출력 예
			l		r		result
			5		555		[5, 50, 55, 500, 505, 550, 555]
			10		20		[-1]
			
		=> 배열로 만들기... 자리수 만큼 0과5 들어가는지 확인...
		=> 많은 해설을 보았다... 쉽게 생각할만한 문제가 아니였다
	 */

    public int[] main(int l, int r) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[05]+")) {
                resultList.add(i);
            }
        }

        if (resultList.isEmpty()) {
            return new int[]{-1};
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}