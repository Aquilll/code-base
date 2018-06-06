
public class MinMaxJavaCode {
	public static void main(String[] args) {
		int arr[] = {1,5,56,35,-9};
		int result[] = findMinMax(arr);
		System.out.println("Minimum is "  + result[0] + " :: Maximum is " + result[1] + " YOAH ;) " );
	}

	private static int[] findMinMax(int[] arr) {
		
		return findMinMaxUtil(arr,0,arr.length-1);
	}

	private static int[] findMinMaxUtil(int[] arr, int start, int end) {
		int result1[] = new int[2];
		int result2[] = new int[2];
		int result[] = new int[2];
		if(start==end){
			result[0]=arr[start];
			result[1]=arr[start];
			return result;
		}else if(start < end){
			int middle = (start+end)/2;
			result1=findMinMaxUtil(arr, start, middle);
			result2=findMinMaxUtil(arr, middle+1, end);
			result[0] =result1[0] <result2[0] ? result1[0] : result2[0];
			result[1]=	result1[1] > result2[1] ? result1[1]:result2[1];
			
			
		}
		return result;
		
	}
}
