package Chapter_13_Graphs;

public class StackX {
	
	private final int maxSize = 10;
	private int[] st;
	private int top;
	
	public StackX(){
		st = new int[maxSize];
		top = -1;
	}
	
	public void push(int val){
		st[++top] = val;
	}
	
	public int pop(){
		return st[top--];
	}
	
	public int peek(){
		return st[top];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}

}
