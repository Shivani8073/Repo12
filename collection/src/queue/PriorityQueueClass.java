package queue;

import java.util.PriorityQueue;

public class PriorityQueueClass {

	public static void main(String[] args) {

		PriorityQueue pq = new PriorityQueue();
		pq.add(30);
		pq.add(12);
		pq.add(8);
		pq.add(29);
		pq.add(2);
		pq.add(100);
		System.out.println(pq);
		for(Object element:pq)
		{
			System.out.println(element);
		}
		System.out.println("Head element is : "+pq.peek());
		System.out.println("Total elements: "+pq.size());
		System.out.println("Removing head element "+pq.poll());
		System.out.println("Total elements: "+pq.size());
	}

}
