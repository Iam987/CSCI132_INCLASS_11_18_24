
public class BinarySearch {

	public static void main(String[] args) {
		int[] array = {2,5,8,10,13,16,19,25,30,100,150};
		
		int num, answer;
		
		num = 26;
		
		answer = binary_search(array, num);
		System.out.println(answer);
		

		answer = binary_search_recursive(array, num, 0, array.length - 1);
		System.out.println(answer);
	}
	
	public static int binary_search(int[] a, int n) {
		int low = 0;
		int high = a.length - 1;
		
		while(low <= high) {
			int mid = (low + high)/2;
			if(a[mid] == n) {
				return mid;
			}
			else if(a[mid] < n) {
				low = mid + 1;
			}
			else {
				high = mid -1;
			}
		}
		return -1;
	}
	
	public static int binary_search_recursive(int[] a, int n, int l, int h) {
		//base case
		if(l > h) {
			return -1;
		}
		int mid = (l + h)/2;
		if(a[mid] == n) {
			return mid;
		}
		else if(n > a[mid]) {
			return binary_search_recursive(a, n, mid + 1 ,h);
		}
		else {
			return binary_search_recursive(a, n, l, mid - 1);
		}
	}
}
