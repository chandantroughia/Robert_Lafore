package Chaper_3_Search;

public class Bubble_Sort {
	public void bubbleSort(int[] arr){
		
		for(int out = arr.length - 1; out > 1; out--){
			for(int in = 0; in < out; in++){
				if(arr[in] > arr[in+1]){
					int temp = arr[in];
					arr[in] = arr[in+1];
					arr[in+1] = temp;
				}
			}
		}
	}
	
	public void print(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {
		Bubble_Sort bs = new Bubble_Sort();
		int[] array = {77,99,44,55,22,88,11,0,66,33};
		bs.bubbleSort(array);
		
		System.out.println("Sorted Array");
		bs.print(array);
		}
}

