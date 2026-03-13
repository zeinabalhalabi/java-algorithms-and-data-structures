package stacks;
import java.util.*;

public class Postfix_evaluation {

	public static void main(String[] args) {
		String s = "10 2 8 * + 3 -";  
		Stack<Integer> t = new Stack<>();
		String[] tok = s.split(" ");
		
		for (int i = 0; i < tok.length; i++) {
			String tokens = tok[i];
			if (tokens.isEmpty()) continue; 
			if (tokens.equals("+") || tokens.equals("-") || tokens.equals("/") || tokens.equals("*")) {
				int b = t.pop();
				int a = t.pop();
				int result = 0;
				
				if (tokens.equals("+")) result = a + b;
				else if (tokens.equals("-")) result = a - b;
				else if (tokens.equals("*")) result = a * b;
				else if (tokens.equals("/")) result = a / b;
				
				t.push(result);	
			} else {
				t.push(Integer.parseInt(tokens));
			}
		}
		System.out.println(t.pop());  // Output: 22
	}
}
