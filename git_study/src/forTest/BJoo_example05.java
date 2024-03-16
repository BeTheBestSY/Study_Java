package forTest;

public class BJoo_example05 {
	public static void main(String[] args) {
		// 5. abcde 순서 바꿔서 출력하기
		
		String ex = "abcde";
		String result = "";
		
		for(int i=ex.length()-1; i>=0; i--) {
			result = result + String.valueOf(ex.charAt(i));
		}
		
		System.out.println(result); 
	}
}
