package Recursion;

public class MergeTwoSortedArrays {
	
	public static int[] merge(int[] arrA, int sizeA, int[] arrB, int sizeB, int[] arrC) {
		
		//intial indexes
		int initA = 0, initB = 0, intiC = 0;
		
		while(initA < sizeA && initB < sizeB){	//if none of the arrays in empty
			if(arrA[initA] < arrB[initB]){
				arrC[intiC++] = arrA[initA++];
			}
			else{
				arrC[intiC++] = arrB[initB++];
			}
		}
		
		//if arrB is empty already
		while(initA < sizeA){
			arrC[intiC++] = arrA[initA++];
		}
		
		while(initB < sizeB){
			arrC[intiC++] = arrB[initB++];
		}
		return arrC;
	}
	
	public static void printArray(int[] arr){
		for(int i: arr){
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int[] arrayA = {23, 47, 81, 95};
		int[] arrayB = {7, 14, 39, 55, 62, 74};
		int[] arrayC = new int[10];
		printArray(merge(arrayA, 4, arrayB, 6, arrayC));
	}

}
