package Chapter_4_Stacks_Queues;

public class Queue {
	
	private int maxSize;
	private int[] qArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int size){
		maxSize = size;
		qArray = new int[maxSize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	
	public int size(){
		return nItems;
	}
	
	public int peekFront(){
		return qArray[front];
	}
	
	public void insert(int value){
		//deal with wrap-around
		if(rear == maxSize - 1){
			rear = -1;
		}
		qArray[++rear] = value;
		nItems++;
	}
	
	public int delete(){
		int temp = qArray[front++];
		//deal with wrap-around
		if(front == maxSize){
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public boolean isFull(){
		return nItems == maxSize;
	}
	
	public boolean isEmpty(){
		return nItems == 0;
	}

}
