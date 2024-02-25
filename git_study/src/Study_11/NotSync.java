package Study_11;

class Data1{
	int i;
}

class AA extends Thread{
	public void run() {
		for(int i=0; i<100000; i++) {
			NotSync.d.i++; // 이미 아래에서 객체생성해두었으므로 그대로 끌어와서 사용.
		}
		System.out.println("AA: " + NotSync.d.i);
	}
}

class BB extends Thread{
	public void run() {
		for(int i=0; i<100000; i++) {
			NotSync.d.i++;
		}
		System.out.println("BB: " + NotSync.d.i);
	}
}


public class NotSync {
	static Data1 d = new Data1();
	public static void main(String[] args) {
		System.out.println("메인 시작");
		AA a = new AA();
		a.start();
		BB b = new BB();
		b.start();
		System.out.println("메인 끝");
	}
}
