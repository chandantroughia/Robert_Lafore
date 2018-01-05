package Chapter_4_Stacks_Queues;

public class QueueApp {
	
	public static void main(String[] args) {
		Queue theQueue = new Queue(10);
		theQueue.insert(10);
		theQueue.insert(11);
		theQueue.insert(12);
		theQueue.insert(13);
		
		System.out.println("Peek: "+theQueue.peekFront());
		System.out.println(theQueue.size());
		
		System.out.println(theQueue.delete());
		System.out.println("Peek: "+theQueue.peekFront());
		System.out.println(theQueue.delete());
		System.out.println("Peek: "+theQueue.peekFront());
		
		System.out.println("Size: "+theQueue.size());
		
		
		System.out.println("Empty ? : "+theQueue.isEmpty());
		System.out.println("Full ? : "+theQueue.isFull());
		
	}
}
