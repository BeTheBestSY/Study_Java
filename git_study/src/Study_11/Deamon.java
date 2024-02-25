package Study_11;

class DeamonTest extends Thread{
	public void run() {
		while(true) {
			try {
				sleep(3000);
			} catch(InterruptedException e) {}

			if(Deamon.autoSave) { // ����ƽ������ 5�� �Ǹ� autoSave(); �޼��� ȣ��.
				autoSave();
			}
		}
	} // run �޼����� ��.
	
	public void autoSave() {
		System.out.println("�۾������� �ڵ� ����Ǿ����ϴ�.");
	}	
}


public class Deamon {
	static boolean autoSave; // boolean�� �⺻���� false
	
	public static void main(String[] args) {
		DeamonTest d = new DeamonTest();
		d.setDaemon(true); // DemonTest�� demon ������� ����.
		d.start();
		
		for(int i=1; i<=20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(i+" ");
			
			if(i==5)
				autoSave = true;
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
