package Other;

public class MergeSort{
	int[] nums;
	int[] helper;
	int numbers;
	
	public void sort(int[] values){
		this.nums = values;
		this.numbers = values.length;
		this.helper = new int[numbers];
		mergeSort(0, numbers - 1);
	}
	
	private void mergeSort(int low, int high){
		if(low < high){
			int mid = low + (high - low)/2;
			mergeSort(low, mid);
			mergeSort(mid + 1, high);
			merge(low, mid, high);
		}
	}
	
	private void merge(int low, int mid, int high){
		for(int i = low; i <= high; i++){
			helper[i] = nums[i];
		}
		
		int i = low;
		int j = mid + 1;
		int k = low;
		
		while(i <= mid && j <= high){
			if(helper[i] <= helper[j]){
				nums[k++] = helper[i++];
			}else{
				nums[k++] = helper[j++];
			}
		}
		
		while(i <= mid){
			nums[k++] = helper[i++];
		}
		
		
			
	}
}