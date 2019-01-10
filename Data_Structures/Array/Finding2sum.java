import java.util.Arrays;


public class Finding2sum {
public static void main(String[] args) {
	 int arr[] = {1, 4, 45, 6, 10, -8};
	    int n = 49;
	   // sortIt(arr);
	    Arrays.sort(arr);
	    printArray(arr);
	    sum(arr,n);
	    System.out.println(sum(arr, n));
}
private static int sum(int[] arr, int n) {
	int l = 0 ;
	int r = arr.length - 1;
	  while (l < r)
	    {
	         if(arr[l] + arr[r] == n)
	              return 1; 
	         else if(arr[l] + arr[r] < n)
	              l++;
	         else // A[i] + A[j] > sum
	              r--;
	    }
	 return 0;
}
private static void printArray(int[] arr) {
	for(int x:arr)
		System.out.print(x+" ");
	System.out.println();
	
}
private static void sortIt(int[] arr) {
	//bubble sort logic
	for(int i=0;i<arr.length;i++){
		for(int j=arr.length-1;j>i;j--){
			if(arr[j] < arr[j-1]){
				swap(arr,j,j-1);
			}
            }
	}
}
private static void swap(int[] arr, int j, int i) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
	
}

}