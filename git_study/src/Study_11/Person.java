package Study_11;

public class Person extends Thread {

	Person(String name){
		super(name); // Thread 이름설정.
	}
	
	public void run() {
		try { // throws에서 넘겨받은 InterruptedException 예외처리하기.
			String v = Main.vshop.lendVideo();
			System.out.println(getName() +":"+ v +" 빌린다.");
			System.out.println(getName() +":"+ v +" 보는중.");
			
			sleep(3000);
			System.out.println(getName() +":"+ v +" 반납");
			
			Main.vshop.returnVideo(v);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
