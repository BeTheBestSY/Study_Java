package Study_11;

import javax.swing.JOptionPane;

public class SingleThread_11 {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + " �Դϴ�.");
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}
