package Study_11;

public class Main {
	static VideoShop vshop = new VideoShop();
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Person p1 = new Person("사나");
		Person p2 = new Person("모모");
		Person p3 = new Person("웬디");
		Person p4 = new Person("정연");
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		System.out.println("프로그램 끝");
	}
}
