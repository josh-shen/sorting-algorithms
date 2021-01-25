
public class heapSort {

    void heapify(int[] a, int i, int n) {
    	int child;
        int temp;

        for(temp = a[i]; 2 * i + 1 < n; i = child) {
            child = 2 * i + 1;
            if(child != n - 1 && a[child] < a[child + 1]) {
                child++;
            }
            if(temp < a[child]) {
                a[i] = a[child];
            }
            else {
                break;
            }
        }
        a[i] = temp;
    }
    
    void heapsort(int[] a) {
        for(int i = a.length / 2 - 1; i >= 0; i--) {  
            heapify(a, i, a.length);
        }
        
        for(int i = a.length - 1; i > 0; i--) {
            swapReferences(a, 0, i);            
            heapify(a, 0, i);
        }
    }
    
    public static void swapReferences(int[] a, int index1, int index2) {
        int tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
    }
    
    public static void main(String args[]) {
    	int[] array = {2, 5, 14, 7, 3, 18, 12, 20};
    	
    	heapSort object = new heapSort();
    	object.heapsort(array);
    	
    	for (int i = 0; i < array.length; i++) {
    		System.out.printf("%d ", array[i]);
    	}
    }
}
