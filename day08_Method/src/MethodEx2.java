
public class MethodEx2 {
	
	
	public static String name(int x, String irum) {
		
		System.out.println("x = "+x);
		return irum;

	}
	
	public static String display(int x, String name) {
			
			for(int i =0; i<=x; i++) {
				System.out.println(name + "\t");
			}
			return name;
		}
	

	public static void main(String[] args) {
		String str =name ( 10, "doyean");
		System.out.println(str);

		System.out.println("name() call"+name(99, "gildong"));
		
		
	}

}
