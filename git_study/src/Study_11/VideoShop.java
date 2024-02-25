package Study_11;
import java.util.Vector;

public class VideoShop {
	private Vector<String> v = new Vector<String>(); 

	public VideoShop() {
		v.addElement("���˵���");
		v.addElement("�м�");
		v.addElement("�����̴���");
	}

	public synchronized String lendVideo() throws InterruptedException {
		Thread t = Thread.currentThread(); // ���� ������ �����尡 �������� ����.
		System.out.println(t.getName()); // �� �������� �̸��� �������� ���.

		if(v.size()==0) {
			System.out.println(t.getName() + ": ��ȣǥ ����");
			wait(); // ��ٸ���� ���. sleep�� �ڵ����� �ٽ� ���۵����� wait�� �ٽ� ����Ҷ����� ��ٸ�.
			System.out.println(t.getName() + ": ���� ����");
		}
		
		String str = v.remove(v.size() -1); // �� ���������� �ϳ��� �����༭ �����.
		return str; // ������ ������ �����͸� ������. ������ �����ְ� ������ ������ �̸��� �����ϴ� ��.
	}
	
	
	public synchronized void returnVideo(String video) {
		v.addElement(video);
		notify(); // ��ٸ��� �ִ� �ְ� ����� ��. wait�� ������ nofify�� �ݵ�� �־�� ��.
	}

}

