package ex07.stringBuffer;
public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.hashCode());
		System.out.println();
		System.out.println("length         /        capacity");
		int len = sb.length();     int size = sb.capacity();
		System.out.println(len+"           /             "+size);
		sb.append("deabo");
		len = sb.length(); 		 size = sb.capacity();
		System.out.println(len+"           /             "+size);
		sb.append("happyvirus");
		len = sb.length();       size = sb.capacity(); 
		System.out.println(len+"           /             "+size);
		
		sb.append("12345 67890");
		len = sb.length();       size = sb.capacity(); 
		System.out.println(len+"           /             "+size);
		
		sb.append("12345 67890");
		len = sb.length();       size = sb.capacity(); 
		System.out.println(len+"           /             "+size);
		System.out.println(sb.hashCode());
		
		sb.trimToSize(); // 용량크기 조절
		len = sb.length();       size = sb.capacity(); 
		System.out.println(len+"           /             "+size);
	}	
}		
