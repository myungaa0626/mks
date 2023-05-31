package ex01.lambda;

import java.util.ArrayList;

public class LambdaMain {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach( (n) -> { System.out.println(n); } ); 
    numbers.forEach( n -> { System.out.println(n); } );  // 인자값이 하나라면 소괄호 안에 넣지 않아도 된다
    
    
    
//    for (int item : numbers) {
//    	
//    	System.out.println(item);
//    }

  }
}