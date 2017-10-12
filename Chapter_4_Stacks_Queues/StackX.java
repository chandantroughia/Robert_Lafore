package Chapter_4_Stacks_Queues;

public class StackX {
	public int top;
	public int MAXSIZE;
	public long[] stackArray;
	
	public StackX(int size){
		top = -1;
		MAXSIZE = size;
		stackArray = new long[MAXSIZE];
	}
	
	public void push(long value){
		stackArray[++top] = value;
	}
	
	public long pop(){
		return stackArray[top--];
	}
	
	public boolean isFull(){
	return top  == stackArray[MAXSIZE - 1];
	}
	
	public boolean isEmpty(){
		return top == -1;
		
	}
	
	public long peek(){
		return stackArray[top];
	}
}
	
