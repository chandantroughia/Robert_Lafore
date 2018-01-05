package Other;

public class QuichSortApp {

	public static void printArray(int[] arr){
		for(Integer I: arr){
			System.out.print(I + " ");
		}
	}

	public static void main(String... args){
		int[] arr = {2,1,3,5,6,4,9,8,7, 10};
		QuickSort obj = new QuickSort();
		obj.sort(arr);
		printArray(arr);
	}
	
}
