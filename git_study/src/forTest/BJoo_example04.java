package forTest;

public class BJoo_example04 {
	public static void main(String[] args) {
		// 4. 로또 번호 추출하기
		
		int[] lotto = new int[6];

		while(true) { // 로또번호생성 while문
		    if(lotto[5] != 0) // lotto배열이 다 채워질 때 까지 반복시키기
				break;

			for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)((Math.random()*45)+1);

				for(int j=0; j<i; j++) { 
					// 중복된 값은 입력되지 않고 다시 진행할 수 있도록 해주기.
					// 마지막 값을 비교할때 용량초과오류 발생하지 않도록 j<i 로 조건설정.

					if(lotto[i] == lotto[j]) { // 자리수 별로 계속 비교하면서 같은 값을 찾으면 
						i--; // 해당 lotto[i] 값을 다시 뽑도록 설정.
						break; // 중복된 숫자 입력 시 계속 반복할 필요없이 바로 비교 종료하기.
					}
				}
			}
		}

	}
}
