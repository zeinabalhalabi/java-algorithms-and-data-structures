package recursion;
import java.util.*;
public class Factorial {
	static HashMap <Integer, Integer> memo = new HashMap<>();
	public static int factorial(int k) {
		if (k == 0 || k == 1) return 1;
		if (k == 2) return 2;
		if (memo.containsKey(k)) {
			return memo.get(k);
		}
		int result = k*factorial(k-1);
		memo.put(k, result);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a number n: ");
		int n = sc.nextInt();
		int k = factorial(n);
		System.out.println("The factorial of " + n + " is: " + k);

	}

}
