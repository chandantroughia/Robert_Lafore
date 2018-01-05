package Chaper_3_Search;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i] < arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
	
	public static void selectionSort(int[] arr){
		for(int i = 0; i < arr.length; i++){
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int arr[]  = {12, 13, 4, 1, 3, 6 , 8};
		
		bubbleSort(arr);
		//selectionSort(arr);
		for(Integer i: arr){
			System.out.print(i + " ");
		}
		
	}

}
