package Other;

public class MergeSortApp {
	
	public static void printArray(int[] arr){
		for(Integer I: arr){
			System.out.print(I + " ");
		}
	}

	public static void main(String... args){
		int[] arr = {2,1,3,5,6,4,9,8,7};
		MergeSort obj = new MergeSort();
		obj.sort(arr);
		printArray(arr);
	}
	
}
