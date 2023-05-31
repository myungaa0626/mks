package Quiz1;

public abstract class Trans {
	
	//String result = " ";
	String name;
	
	public abstract String start(String name); 
	public abstract void stop(String name); 
	public String name(String name) {
		return name;
		
	}
}
