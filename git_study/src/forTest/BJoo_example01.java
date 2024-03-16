package forTest;

public class BJoo_example01 {
	public static void main(String[] args) {
		// 1. 1~100까지 더하기
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~100까지의 합 : " + sum);
	}
}
