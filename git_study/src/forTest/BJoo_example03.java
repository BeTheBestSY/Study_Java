package forTest;

public class BJoo_example03 {
	public static void main(String[] args) {
		// 3. ������ 3�ܿ��� 4�� ����� �����ϰ� ����ϱ�
		
		int dan=3;
		
		for(int i=1; i<=9; i++) {
			if(i%4==0) { // i�� 4�� ������,
				System.out.println("4�� ����� �����մϴ�.");
			} else {
				System.out.println(dan+"x"+i+"="+dan*i);
			}
		}
		
	}
}
