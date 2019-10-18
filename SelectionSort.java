public class SelectionSort implements SortingAlgorithm {
	@Override
	public void sort (int[] a) {
		int n = a.length;
		
		int i = 0;
		while (true) {
			if (i >= n - 1) break;
			int min_idx = i;
			int j = i+1;
			while (true) {
				if (j >= n) break;
				if (a[j] < a[min_idx])
					min_idx = j;
				j++;
			}
			
			int temp = a[min_idx];
			a[min_idx] = a[i];
			a[i] = temp;
			i++;
		}
	}
}
