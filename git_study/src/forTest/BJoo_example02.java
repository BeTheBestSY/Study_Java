package forTest;

public class BJoo_example02 {
	public static void main(String[] args) {
		// 2. for���� �̿��� ������ ����ϱ�
		
		for(int i=1; i<=9; i++) {
			System.out.println(i+"��");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println("------------");
		}

	}
}
