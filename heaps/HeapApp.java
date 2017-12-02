package heaps;

public class HeapApp {

	
	public static void main(String[] args) {
		int val1, val2;
		Heap theHeap = new Heap(10);
		
		theHeap.insert(10);
		theHeap.insert(20);
		theHeap.insert(19);
		theHeap.insert(9);
		theHeap.insert(30);
		
		theHeap.printHeap();
		
		System.out.println();
		//theHeap.printHeap();
		
		theHeap.remove();
		
		theHeap.printHeap();
		
	}
}
