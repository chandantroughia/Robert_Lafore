package Chapter_13_Graphs;

public class Queue {

	private int MAX_SIZE = 20;
	private int[] queueArray;
	private int front;
	private int rear;
	
	//constructor
	public Queue(){
		queueArray = new int[MAX_SIZE];
		front = 0;
		rear = -1;
	}
	
	public void enQueue(int val){
		if(rear == MAX_SIZE - 1){
			rear = -1;
		}
		queueArray[++rear] = val;
	}
	
	
	public int deQueue(){
		int temp = queueArray[front++];
		if(front == MAX_SIZE){
			rear = 0;
		}
		return temp;
	}
	
	public boolean isEmpty(){
		return (front == rear + 1 || front + MAX_SIZE -1 == rear);
	}
	
}
