package bakjoonProblem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class bakjoon4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		String input;
		char c;
		while(true) {
			stack.clear();
			input = br.readLine();
			if(input.equals(".")) {
				break;
			}
			for(int i =0; i<input.length(); i++) {
				c = input.charAt(i);
				if(c=='(' || c=='[') {
					stack.push(c);
					}else if (c==')' || c==']') {
						if(stack.isEmpty() || (stack.peek()=='('&& c==']'|| (stack.peek() == '[' && c == ')'))){
							stack.push(c);
							break;
						}
						stack.pop();
					}
			} // for end
		
			if(!stack.isEmpty()) {
				sb.append("no").append("\n");
			}else {
				sb.append("yes").append("\n");
			}
		} // while end
		System.out.println(sb.toString());
	}
}
