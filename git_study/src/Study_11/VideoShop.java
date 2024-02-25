package Study_11;
import java.util.Vector;

public class VideoShop {
	private Vector<String> v = new Vector<String>(); 

	public VideoShop() {
		v.addElement("범죄도시");
		v.addElement("밀수");
		v.addElement("스파이더맨");
	}

	public synchronized String lendVideo() throws InterruptedException {
		Thread t = Thread.currentThread(); // 현재 접근한 쓰레드가 무엇인지 리턴.
		System.out.println(t.getName()); // 그 쓰레드의 이름이 무엇인지 출력.

		if(v.size()==0) {
			System.out.println(t.getName() + ": 번호표 받음");
			wait(); // 기다리라는 명령. sleep은 자동으로 다시 시작되지만 wait는 다시 명령할때까지 기다림.
			System.out.println(t.getName() + ": 다음 순서");
		}
		
		String str = v.remove(v.size() -1); // 맨 끝에서부터 하나씩 빌려줘서 사라짐.
		return str; // 위에서 삭제한 데이터를 리턴함. 비디오를 빌려주고 빌려준 비디오의 이름을 리턴하는 셈.
	}
	
	
	public synchronized void returnVideo(String video) {
		v.addElement(video);
		notify(); // 기다리고 있던 애가 깨어나게 됨. wait가 있으면 nofify가 반드시 있어야 함.
	}

}

