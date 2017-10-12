package Chapter_4_Stacks_Queues;

public class QueueApp {
	public static void main(String[] args) {
		Queue theQueue = new Queue(5);
				theQueue.insert(10); 
				theQueue.insert(20); 
				theQueue.insert(30); 
				theQueue.insert(40);
				theQueue.remove(); 
				theQueue.remove(); 
				theQueue.remove();
				theQueue.insert(50); 
				theQueue.insert(60); 
				theQueue.insert(70); 
				theQueue.insert(80);
				
				while(!theQueue.isEmpty()){
					long temp = theQueue.remove();
					System.out.print(temp + " ");
				}
				System.out.println();
	}
}
