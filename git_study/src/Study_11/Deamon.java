package Study_11;

class DeamonTest extends Thread{
	public void run() {
		while(true) {
			try {
				sleep(3000);
			} catch(InterruptedException e) {}

			if(Deamon.autoSave) { // 스태틱변수가 5가 되면 autoSave(); 메서드 호출.
				autoSave();
			}
		}
	} // run 메서드의 끝.
	
	public void autoSave() {
		System.out.println("작업파일이 자동 저장되었습니다.");
	}	
}


public class Deamon {
	static boolean autoSave; // boolean의 기본값은 false
	
	public static void main(String[] args) {
		DeamonTest d = new DeamonTest();
		d.setDaemon(true); // DemonTest를 demon 스레드로 설정.
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
		System.out.println("프로그램을 종료합니다.");
	}
}
