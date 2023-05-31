package Quiz1;

public class MainEntry {
	
	public static void main(String[] args) {
		
		Trans[] tr = new Trans[4];
		tr[0] = new Subway();
		tr[1] = new Bus();
		tr[2] = new Bicycle();
		tr[3] = new Plain();
		
		String[] name = {"Subway", "Bus","Bicycle", "Plain"};
		
		for(int i = 0; i<tr.length; i++) {
			tr[i].start(name[i]);
			tr[i].stop(name[i]);
		}
	}
}
