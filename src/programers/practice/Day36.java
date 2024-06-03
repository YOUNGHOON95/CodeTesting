package programers.practice;

import java.util.Arrays;

public class Day36 {
	/*
	 * 문제 설명
		1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
		
		네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
		세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
		주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
		어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
		네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
		
		네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
		
		
		입출력 예 설명
			입출력 예 #1
			
			예제 1번에서 네 주사위 숫자가 모두 2로 같으므로 1111 × 2 = 2222점을 얻습니다. 따라서 2222를 return 합니다.
			입출력 예 #2
			
			예제 2번에서 세 주사위에서 나온 숫자가 4로 같고 나머지 다른 주사위에서 나온 숫자가 1이므로 (10 × 4 + 1)2 = 412 = 1681점을 얻습니다. 따라서 1681을 return 합니다.
			입출력 예 #3
			
			예제 3번에서 a, d는 6으로, b, c는 3으로 각각 같으므로 (6 + 3) × |6 - 3| = 9 × 3 = 27점을 얻습니다. 따라서 27을 return 합니다.
			입출력 예 #4
			
			예제 4번에서 두 주사위에서 2가 나오고 나머지 다른 두 주사위에서 각각 5, 6이 나왔으므로 5 × 6 = 30점을 얻습니다. 따라서 30을 return 합니다.
			입출력 예 #5
			
			예제 5번에서 네 주사위 숫자가 모두 다르고 나온 숫자 중 가장 작은 숫자가 2이므로 2점을 얻습니다. 따라서 2를 return 합니다.
			
			=> 단순하게 IF문으로 예제에 있는 조건 5개만 필요하면 될줄 알았
		
	 */
    public int main(int a, int b, int c, int d) {
        int[] dice = new int[4];
        int answer = 0;
        dice[0] = a;
        dice[1] = b;
        dice[2] = c;
        dice[3] = d;
        
        
        Arrays.sort(dice);
        
        if(dice[0]==dice[3]){
            answer = 1111*a;
        }else if(dice[0]==dice[2]){
            answer = (10*dice[0]+dice[3])*(10*dice[0]+dice[3]);
        }else if(dice[1]==dice[3]){
            answer = (10*dice[3]+dice[0])*(10*dice[3]+dice[0]);
        }else if(dice[0]==dice[1]&&dice[2]==dice[3]){
            answer = (dice[0]+dice[2]) * Math.abs(dice[0]-dice[2]);
        }else if(dice[0]==dice[1]){
            answer = dice[2]*dice[3];
        }else if(dice[1]==dice[2]){
            answer = dice[0]*dice[3]; 
        }
        else if(dice[2]==dice[3]){
            answer = dice[0]*dice[1];
        }else{
            answer = dice[0];
        }
        
        
        return answer;
    }
}
