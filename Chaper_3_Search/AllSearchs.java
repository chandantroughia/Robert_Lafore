package Chaper_3_Search;

import java.util.Arrays;

public class AllSearchs {
	public static int linearSearch(int[] arr, int key){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == key) return i;
		}
		return 0;
	}
	
	//Binary search only for sorted arrays
	public static int binarySearch(int[] arr, int key){
		Arrays.sort(arr);
		int currentIndex;
		int lowerIndex = 0;
		int higherIndex = arr.length - 1;
		
		while(true){
			currentIndex = (lowerIndex + higherIndex)/2;
			if(arr[currentIndex] == key) return currentIndex;
			else if(lowerIndex > higherIndex) return arr.length;
			else{
				if(key < arr[currentIndex]){
					higherIndex = currentIndex - 1;
				}
				else{
					lowerIndex = currentIndex + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]  = {12, 13, 4, 1, 3, 6 , 8};
		System.out.println(linearSearch(arr, 8));
		System.out.println(binarySearch(arr, 8));
	}
}
