package Study_11;

public class Main {
	static VideoShop vshop = new VideoShop();
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		Person p1 = new Person("�糪");
		Person p2 = new Person("���");
		Person p3 = new Person("����");
		Person p4 = new Person("����");
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		System.out.println("���α׷� ��");
	}
}