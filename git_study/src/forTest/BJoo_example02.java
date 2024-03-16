package forTest;

public class BJoo_example02 {
	public static void main(String[] args) {
		// 2. for문을 이용해 구구단 출력하기
		
		for(int i=1; i<=9; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println("------------");
		}

	}
}
