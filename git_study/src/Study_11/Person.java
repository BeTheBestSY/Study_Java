package Study_11;

public class Person extends Thread {

	Person(String name){
		super(name); // Thread �̸�����.
	}
	
	public void run() {
		try { // throws���� �Ѱܹ��� InterruptedException ����ó���ϱ�.
			String v = Main.vshop.lendVideo();
			System.out.println(getName() +":"+ v +" ������.");
			System.out.println(getName() +":"+ v +" ������.");
			
			sleep(3000);
			System.out.println(getName() +":"+ v +" �ݳ�");
			
			Main.vshop.returnVideo(v);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
