
public class insertionSort {
	 public void insertionsort(int[] a) {
	        int j;

	        for(int i = 1; i < a.length; i++) {
	            int temp = a[i];
	            
	            for( j = i; j > 0 && temp < a[j - 1]; j--) {
	                a[j] = a[j - 1];
	            }
	            a[j] = temp;
	        }
	    }

	public static void main(String[] args) {
		int[] array = {2, 5, 14, 7, 3, 18, 12, 20};
    	
    	insertionSort object = new insertionSort();
    	object.insertionsort(array);
    	
    	for (int i = 0; i < array.length; i++) {
    		System.out.printf("%d ", array[i]);
    	}

	}

}
