package study.chapter9;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueInterfaceTest {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(4);
		queue.offer(5);
		queue.add(8);
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.poll());
	}

}
