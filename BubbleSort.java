import java.util.stream.IntStream;

public class BubbleSort implements SortingAlgorithm {
	@Override
	public void sort (int[] a) {
		int n = a.length;
		// swap arr[j+1] and arr[i]
		IntStream.range (0, n - 1).flatMap (i -> IntStream.range (0, n - i - 1)).filter (j -> a[j] > a[j + 1]).forEach (j -> {
			int temp = a[j];
			a[j] = a[j + 1];
			a[j + 1] = temp;
		});
		
	}
}
