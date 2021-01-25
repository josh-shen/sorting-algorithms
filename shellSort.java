
public class shellSort {
	int shellsort(int[] a) {  

		for (int gap = a.length / 2; gap > 0; gap /= 2) { 
			for (int i = gap; i < a.length; i++) { 
				int temp = a[i]; 
				int j; 
				
				for (j = i; j >= gap && a[j - gap] > temp; j -= gap) { 
					a[j] = a[j - gap]; 
				}

				a[j] = temp; 
			} 
		} 
		return 0; 
	} 

	public static void main(String args[]) { 
		int arr[] = {2, 5, 45, 22, 10, 1, 12, 7}; 

		shellSort object = new shellSort(); 
		object.shellsort(arr);
		
		for (int i = 0; i < arr.length; i++) {
    		System.out.printf("%d ", arr[i]);
    	}
	} 
}
