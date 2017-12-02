package Recursion;

public class MergeSortArray {
	
	private long[] theArray;
	private int elements;
	
	
	public MergeSortArray(int size){
		 theArray = new long[size];
		 elements = 0;
	}
	
	public void insert(long val){
		theArray[elements++]  = val;
	}
	
	public void display(){
		for(long l: theArray){
			System.out.print(l + " ");
		}
	}
	
	public void mergeSort(){
		long[] workspace = new long[elements];
		recUtil(workspace, 0, elements - 1);
	}
	
	private void recUtil(long[] workspace, int start, int end){
		if(start == end) return;
		else{
			int mid = (start + end) / 2;
			recUtil(workspace, start, mid);
			recUtil(workspace, mid + 1, end);
			mergeArrays(workspace, start, mid, end);
		}
	}
	
	private void mergeArrays(long[] workSpace, int start, int mid, int end){
		int ptr = 0;
		int low = start;
		//int mid = midPtr - 1;
		int high = end;
		
		while(low < mid && mid < high){
			if(theArray[low] < theArray[mid]){
				workSpace[ptr++] = theArray[low++];
			}
			else{
				workSpace[ptr++] = theArray[mid++];
			}
		}
		
		
		while(low < mid){
			workSpace[ptr++] = theArray[low++];
		}
		
		while(mid < high){
			workSpace[ptr++] = theArray[mid++];
		}
		
		
			
	} // end merge()
	
	
}
