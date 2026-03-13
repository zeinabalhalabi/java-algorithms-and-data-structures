package stacks;

public class BalancedBrackets {

	public static void main(String[] args) {
		String s = "([[][])";
		boolean t = balanced(s);
		System.out.println(t);
	}
	
	public static boolean balanced(String s) {
		Stack <Character> brackets = new Stack <Character>();
		for (int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				brackets.push(ch);
			}
			else if (ch == ')' || ch == '}' || ch == ']') {
                if (brackets.isEmpty()) return false;
                char top = brackets.pop();
                if (ch == ')' && top != '(' || ch == ']' && top != '[' || ch == '}' && top != '{') return false;
		}
			
	} return brackets.isEmpty();

}}
