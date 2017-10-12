package Chaper_3_Search;

public class AllSorts {

	//bubble sort is slow and the time complexity here is O(n^2)
	public static int[] bubbleSort(int[] arr){
		for(int out = arr.length - 1; out > 1; out--){
			for(int in = 0; in < out; in++){
				if(arr[in] > arr[in + 1]){
					int temp = arr[in];
					arr[in] = arr[in + 1];
					arr[in + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	//Selection Sort also has the time complexity of bubble sort but it is considerably
	//faster than bubble sort --> O(n^2)
	public static int[] selectionSort(int[] arr){
		int min, in, out;
		for( out = 0; out < arr.length - 1; out++){
			min = out;
			for( in = out + 1; in < arr.length; in++){
				if(arr[in] < arr[min]){
					min = in;
				}
			}
			int temp = arr[out];
			arr[out] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
	
	//O(n^2) -- best case O(n)
	public static int[] insertionSort(int[] arr){
		int valueToInsert, holePosition;
		for(int i = 1; i < arr.length; i++){
			valueToInsert = arr[i];
			holePosition = i;
			
			while(holePosition > 0 && arr[holePosition - 1] > valueToInsert){
				arr[holePosition] = arr[holePosition - 1];
				holePosition = holePosition -1;
			}
			arr[holePosition] = valueToInsert;
		}
		return arr;
	}
	
	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", " );
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr1[]  = {12, 13, 4, 1, 3, 6 , 8};
		int arr2[]  = {12, 44, 4, 88, 3, 6 , 11};
		int arr3[]  = {12, 10, 4, 15, 3, 46 , 8};
		
		bubbleSort(arr1);
		selectionSort(arr2);
		insertionSort(arr3);
		
		printArray(arr1);
		printArray(arr2);
		printArray(arr3);
		
	}
}
