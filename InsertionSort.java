public class InsertionSort implements SortingAlgorithm {
	@Override
	public void sort (int[] a) {
		int n = a.length;
		int i = 1;
		while (true) {
			if (i >= n) break;
			int temp = a[i];
			int j = i - 1;
			
			if (j >= 0 && a[j] > temp) {
				do {
					a[j + 1] = a[j];
					j = j - 1;
				} while (j >= 0 && a[j] > temp);
			}
			a[j + 1] = temp;
			++i;
		}
	}
}
