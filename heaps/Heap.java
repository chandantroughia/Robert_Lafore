package heaps;

public class Heap {

	private HeapNode[] heapArray;
	private int maxSize;
	private int currSize;
	
	public Heap(int size){
		
		maxSize = size;
		currSize = 0;
		heapArray = new HeapNode[maxSize];
		
	}
	
	public boolean isEmpty(){
		return currSize == 0;
	}
	
	public boolean insert(int value){
		
		if(currSize == maxSize) return false;
		HeapNode newNode = new HeapNode(value);
		heapArray[currSize] = newNode;
		trickleUp(currSize++);
		return true;
		
	}
	
	public void trickleUp(int index){
		
		int parent = (index - 1)/2;
		HeapNode bottom = heapArray[index];
		while(index > 0 && heapArray[parent].getKey() < bottom.getKey()){
			heapArray[index] = heapArray[parent]; //down
			index = parent;	//move index to parent
			parent = (parent - 1)/2;
		}
		
		heapArray[index] = bottom;
		
	}
	
	public HeapNode remove(){	//delete the item with the max key
		
		HeapNode root = heapArray[0];
		heapArray[0] = heapArray[--currSize];
		trickleDown(0);
		return root;
		
	}
	
	public void trickleDown(int index){
		
		int large;
		HeapNode top = heapArray[index];
		
		while(index < currSize/2){ //while node has at least one child
			int leftChild = 2*index + 1;
			int rightChild = leftChild + 1;
			
			if(rightChild < currSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()){
				large = rightChild;
			}
			else{
				large = leftChild;
			}
			
			if(top.getKey() >= heapArray[large].getKey())
				break;
			
			heapArray[index] = heapArray[large];
			index = large;
		}
		
		heapArray[index] = top;
		
	}
	
	public boolean changeValue(int index, int newValue){
		if(index < 0 || index > maxSize){
			return false;
		}
		
		int oldValue = heapArray[index].getKey();
		heapArray[index].setKey(newValue);
		
		if(oldValue < newValue){
			trickleUp(index);
		}
		else{
			trickleDown(index);
		}
		
		return true;
		
	}
	
	public void printHeap(){
		for(int i = 0; i < currSize; i++){
			System.out.print(heapArray[i].getKey() + " ");
		}
	}
	
}
