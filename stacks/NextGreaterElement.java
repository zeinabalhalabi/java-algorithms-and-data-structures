package stacks;

import java.util.Arrays;

public class NextGreaterElement {
	
	public static int [] findsecondgreatest (int a[]) {
		Stack <Integer> s = new Stack<>();
		int [] result = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
		while (!s.isEmpty() && s.peek() <= a[i]) {
			s.pop();
		}
		if (s.isEmpty()) { result[i] = -1;}
		else {result[i] = s.peek();}
		s.push(a[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		int a [] = {4, 5,2,10,8};
		int result [] = findsecondgreatest(a);
		System.out.println(Arrays.toString(result));

	}

}
