package test;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		Queue<String> q=new PriorityQueue<String>();
		q.add("11");
		q.add("9");
		q.add("10");
		q.add("7");
		q.add("15");
		q.add("9");//allows duplicates
		System.out.println(q.peek());
		System.out.println(q);
		//delete first in queue
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.hashCode());
		System.out.println(q);
		Iterator<String> i=q.iterator();			
			
			while(i.hasNext()) {
				System.out.println(i.next());
				
			}

			
		}

}
