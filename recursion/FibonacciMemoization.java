package recursion;
import java.util.HashMap;
//using memoization helps with space and efficiency 
import java.util.Scanner;
public class fibonacciSeries {
	static HashMap <Integer, Integer> memo = new HashMap<>();
	//0 1 1 2 3 5 8 13 21 34
	public static int fib(int k) {
		if (k == 1) return 0;
		if (k ==2 || k == 3) return 1;
		if (memo.containsKey(k)) {
			return memo.get(k);
		}
		int result = fib(k-1) + fib(k-2);
		memo.put(k, result);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number n: ");
		int n = sc.nextInt();
		int k = fib(n);
		System.out.println(k);

	}

}
