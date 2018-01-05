package Other;

public class QuickSort {

	private int[] array;
	private int number;
	
	public void sort(int[] values){
		this.array = values;
		number = values.length;
		quickSort(0, number - 1);
	}
	
	private void quickSort(int low, int high){
		int i = low, j = high;
		int pivot = array[low + (high - low)/2];
		
		while(i <= j){
			while(array[i] < pivot){
				i++;
			}
			
			while(array[j] > pivot){
				j--;
			}
			
			while(i <= j){
				exchange(i++, j--);
			}
		}
		
		if(low <= j){
			quickSort(low, j);
		}
		
		if(i < high){
			quickSort(i,  high);
		}
	}
	
	private void exchange(int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
}
