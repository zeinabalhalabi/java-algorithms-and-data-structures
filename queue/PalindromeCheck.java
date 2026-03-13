package queues;

public class PalindromeCheck {
	//input [1,2,3,2,1] output: true
	//input [1,2,3] output: false
	
	public static boolean checkpal(Queue <Integer> q) {
		Stack <Integer> s = new Stack<>();
		int size = q.size();
		for (int i= 0; i < size/2; i++ ) {
			int p = q.dequeue();
			s.push(p);
		}
		if (size % 2 != 0) {
			q.dequeue();
		}
		while (!s.isEmpty()) {
			if (!s.pop().equals(q.dequeue())) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Queue <Integer> q = new Queue<>();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(20);
		q.enqueue(10);
		boolean q1 = checkpal(q);
		System.out.println(q1);
		

	}

}
