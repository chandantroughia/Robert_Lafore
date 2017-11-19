package heaps;

public class HeapNode {
	
	private int value;
	
	public HeapNode(int key){
		value = key;
	}
	
	public int getKey(){
		return value;
	}
	
	public void setKey(int data){
		value = data;
	}
}
