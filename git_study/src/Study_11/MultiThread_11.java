package Study_11;
import javax.swing.JOptionPane;

class Thread_m extends Thread{
	// i�� ����ϴ� �����带 ���� �������.
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}

public class MultiThread_11 {
	public static void main(String[] args) {
		Thread_m th = new Thread_m();
		th.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� " + input + " �Դϴ�.");
	}
}
