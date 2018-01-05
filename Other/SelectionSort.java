package Other;

public class SelectionSort {
	
	public static void printArray(int[] arr){
		for(int i: arr){
			System.out.print(i + " ");
		}
	}
	
	public static void selectionSort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[minIndex] > arr[j]){
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int [] arr = {2,3,1,6,5,8,7};
		selectionSort(arr);
		printArray(arr);
	}

}
