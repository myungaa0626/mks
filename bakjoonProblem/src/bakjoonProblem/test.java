package bakjoonProblem;
public class test {
	
	
	int quantity;
	int itemPrice;
	
	double calculateTotal() {
		  double basePrice = quantity * itemPrice;
		  if (basePrice > 1000) {
		    return basePrice * 0.95;
		  }
		  else {
		    return basePrice * 0.98;
		  }
		}

	public static void main(String[] args) {

	
	
		
		
		
		
		
		
	}
}