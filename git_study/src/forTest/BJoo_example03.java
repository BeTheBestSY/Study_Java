package forTest;

public class BJoo_example03 {
	public static void main(String[] args) {
		// 3. 구구단 3단에서 4의 배수는 제외하고 출력하기
		
		int dan=3;
		
		for(int i=1; i<=9; i++) {
			if(i%4==0) { // i가 4의 배수라면,
				System.out.println("4의 배수라서 생략합니다.");
			} else {
				System.out.println(dan+"x"+i+"="+dan*i);
			}
		}
		
	}
}
