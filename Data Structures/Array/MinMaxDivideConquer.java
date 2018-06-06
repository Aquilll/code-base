
public class MinMaxDivideConquer {
	public static void main(String[] args) {
		int arr[] = {1,5,56,35,-9};
		int result[] = findMinMax(arr);
		System.out.println("Minimum is "  + result[0] + " :: Maximum is " + result[1] + " YOAH ;) " );
	}

	private static int[] findMinMax(int[] arr) {
		int Min=Integer.MAX_VALUE;
		int Max=Integer.MIN_VALUE;
		
		return findMinMaxUtil(arr,0,arr.length-1,Min,Max);
	}

	private static int[] findMinMaxUtil(int[] arr, int start, int end,int min,int max) {
		int max1=Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		if(start == end){
			min = arr[start];
			max = arr[start];
		}else if(start > end){
			int middle = (start + end) / 2;
			findMinMaxUtil(arr, start, middle, min, max);
			findMinMaxUtil(arr, start, middle, min1, max1);
			if(min < min1)
				min = min1;
			
			
			if(max > max1)
				max = max1;
			
		}
		int result[] = {min,max};
		return result;
	}
}
