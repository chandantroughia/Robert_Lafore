package Chapter_4_Stacks_Queues;

public class StackApp {
	public static void main(String[] args) {
		StackX theStack = new StackX(6);
		
		theStack.push(11);
		theStack.push(12);
		theStack.push(13);
		theStack.push(14);
		theStack.push(15);
		theStack.push(16);
		
		theStack.peek();
		theStack.pop();
		theStack.pop();
		System.out.println(theStack.isEmpty());
		System.out.println(theStack.isFull());
		
		while(!theStack.isEmpty()){
			long value = theStack.pop();
			System.out.print(value + " ");
		}
		System.out.println();
		
	}
	
	
	
}
