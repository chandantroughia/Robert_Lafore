package Recursion;

import java.awt.peer.DialogPeer;

public class mergesort {
	
	private  static void recUtil(long[] theArray, long[] workspace, int start, int end){
		if(start == end) return;
		else{
			int mid = (start + end) / 2;
			recUtil(theArray, workspace, start, mid);
			recUtil(theArray, workspace, mid + 1, end);
			mergeArrays(theArray, workspace, start, mid + 1, end);
		}
	}
	
	private static void mergeArrays(long[] theArray, long[] workSpace, int start, int lauda, int end){
		int ptr = 0;
		int low = start;
		int mid = lauda - 1;
		int n = end - low +1 ;
		
		
		while(start <= mid && lauda <= end){
			if(theArray[start] < theArray[lauda]){
				workSpace[ptr++] = theArray[start++];
			}
			else{
				workSpace[ptr++] = theArray[lauda++];
			}
		}
		
		
		while(start <= mid){
			workSpace[ptr++] = theArray[start++];
		}
		
		while(lauda <= end){
			workSpace[ptr++] = theArray[lauda++];
		}
		
		for(ptr = 0; ptr < n; ptr++){
			theArray[low + ptr] = workSpace[ptr];
		}
		
	} 
	
	public static void display(long[] arr){
		for(long l: arr){
			System.out.print(l + " ");
		}
	}
	
	
	public static void main(String[] args) {
		long[] theArray = {64 ,21, 33, 70, 12, 85, 44, 3, 99, 0, 108, 36};
		display(theArray);
		
		System.out.println();
		int len = theArray.length;
		long[] workspace = new long[len];
		recUtil(theArray, workspace, 0, len - 1);
		display(workspace);
		System.out.println();
		display(theArray);
	}

	
}