package forTest;

public class BJoo_example04 {
	public static void main(String[] args) {
		// 4. �ζ� ��ȣ �����ϱ�
		
		int[] lotto = new int[6];

		while(true) { // �ζǹ�ȣ���� while��
		    if(lotto[5] != 0) // lotto�迭�� �� ä���� �� ���� �ݺ���Ű��
				break;

			for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)((Math.random()*45)+1);

				for(int j=0; j<i; j++) { 
					// �ߺ��� ���� �Էµ��� �ʰ� �ٽ� ������ �� �ֵ��� ���ֱ�.
					// ������ ���� ���Ҷ� �뷮�ʰ����� �߻����� �ʵ��� j<i �� ���Ǽ���.

					if(lotto[i] == lotto[j]) { // �ڸ��� ���� ��� ���ϸ鼭 ���� ���� ã���� 
						i--; // �ش� lotto[i] ���� �ٽ� �̵��� ����.
						break; // �ߺ��� ���� �Է� �� ��� �ݺ��� �ʿ���� �ٷ� �� �����ϱ�.
					}
				}
			}
		}

	}
}
