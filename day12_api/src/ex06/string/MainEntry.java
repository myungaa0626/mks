package ex06.string;
		
public class MainEntry {
		
	public static void main(String[] args) {
		int x = 999;
		String str = "Hello";
		System.out.println("str : "+str);
		
		char data[] = { 'a','b','c'};
		str = new String(data);
		System.out.println("kbs");
		
		String msg = "cdefghij";
		System.out.println(" korea "+msg);
		System.out.println(msg);
		
		msg = msg.concat(" Korea"); // 문자열 결합
		System.out.println(msg);
		
		String str2 = "abcdefghi1234567890jwxy".substring(2, 5); // 상한값 포함, 하한값 미포함
		System.out.println(str2); //cde
		
		System.out.println(msg + " : "+ str2);
	}	
}		
