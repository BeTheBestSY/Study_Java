package Study_11;
import javax.swing.JOptionPane;

class Thread_m extends Thread{
	// i를 출력하는 스레드를 따로 만들었음.
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
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + input + " 입니다.");
	}
}
