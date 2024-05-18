package programers.practice;

public class Day24 {
	/*
	 * 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
	 * 
	 * 입출력 예
		num_list		result
		[3, 4, 5, 2, 1]	393
		[5, 7, 8, 3]	581
		
		=>num list의 홀수 짝수 따로 이어 붙인다 => 행변환 신경써야 했다 ... 배열안에 수 INT값 
	 */
	public int main(int[] num_list) {
		int answer = 0;
		int a = 0;
		String odd = "";
		String even = "";
		for(int i = 0 ; i < num_list.length ; i++) {
			a = num_list[i];
			if(a % 2 == 0) {
				//짝수일 때
                Integer.toString(a);
				even += a;
			}else{
				//홀수
                Integer.toString(a);
				odd += a;
			}
			answer = Integer.valueOf(even) + Integer.valueOf(odd);
		}
		
        return answer;
    }
}