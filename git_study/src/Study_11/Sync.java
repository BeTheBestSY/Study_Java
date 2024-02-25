package Study_11;

class Data2{
	int i;
}

class AA2 extends Thread{
	public void run() {
		for(int i=0; i<100000; i++) {
			synchronized (Sync.d) {
				Sync.d.i++;
			}	
		}
		System.out.println("AA2: " + Sync.d.i);
	}
}

class BB2 extends Thread{
	public void run() {
		for(int i=0; i<100000; i++) {
			synchronized (Sync.d) { // �����ڿ��� �ִ� ���� �� �������� ����ȭ��Ű��.
				Sync.d.i++;
			}	
		}
		System.out.println("BB2: " + Sync.d.i);
	}
}

public class Sync {
	static Data2 d = new Data2(); // AA�� BB�� �Ӱ迵��.
	public static void main(String[] args) {
		System.out.println("���� ����");
		AA2 a = new AA2();
		a.start();
		BB2 b = new BB2();
		b.start();
		System.out.println("���� ��");
	}
}
