package Chapter_4_Stacks_Queues;

public class Queue {
	public int size;
	public long[] arr;
	public int front;
	public int end;
	public int count;
	
	public Queue(int s){
		size = s;
		arr = new long[size];
		front = 0;
		end = -1;
		count = 0;
	}
	
	public void insert(long item){
		if(end == size - 1){
			end = -1;
		}
		arr[++end] = item;
		count++;
	}
	
	public long remove(){
		long temp = arr[front++];
		if(front == size)
			front = 0;
		count--;
		return temp;
	}
	
	public long peekFront(){
		return arr[front];
	}
	
	public boolean isEmpty(){
		return count == 0;
	}
	
	public boolean isFull(){
		return count == size;
	}
	
	public int size(){
		return count;
	}
}
