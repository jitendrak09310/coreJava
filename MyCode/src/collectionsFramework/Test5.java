package collectionsFramework;

import java.util.PriorityQueue;

public class Test5 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(5);
		pq.offer(1);
		pq.offer(3);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.size());
	}

}
