package first;

public class BinarySearch {
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
//The list has been exhausted without a match
		return -low - 1;

	}
	public static int recursiveBinarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		return recursiveBinarySearch(list, key, low, high);
		}
		public static int recursiveBinarySearch(int[] list, int key,  int low, int high) {
		if (low > high)	
			// The list has been exhausted without a match
			return -low - 1;
		int mid = (low + high) / 2;  if (key < list[mid])
		return recursiveBinarySearch(list, key, low, mid - 1);  else if (key == list[mid])
		return mid;  else
		return recursiveBinarySearch(list, key, mid + 1, high);
		}

	public static void main(String[] args) {
		int[] list = { 1, 2, 3, 4, 5, 6, 10 };
		System.out.println(binarySearch(list, 6));
		System.out.println(recursiveBinarySearch(list, 6));
	}
}
