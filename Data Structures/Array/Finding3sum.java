import java.util.Arrays;


public class Finding3sum {
public static void main(String[] args) {
	int arr[] = {1, 5, 6, 8, 9};
	int n = 20;
	boolean sumPresent=false;
	Arrays.sort(arr);
	for(int i = 0 ; i < n ; i++){
		n-= arr[i];
		int dummy[] = sum(arr, n, i);
		if(dummy[0]!=-1){
			System.out.println(n + " = " + arr[i] + "+" + arr[dummy[0]] + "+" + arr[dummy[1]]);
			sumPresent=true;
			break;
		}
	}
	if(sumPresent==true){
		System.out.println("sum is present");
	}
	else
		System.out.println("sum is not present");
	}
private static int[] sum(int[] arr, int n, int i) {
	int l = i ;
	int result[]=new int[2];
	result[0]=-1;
	int r = arr.length - 1;
	  while (l < r)
	    {
	         if(arr[l] + arr[r] == n){
	        	 result[0]=l;
	        	 result[1]=r;
	        	 return result;
	         }
	              
	         else if(arr[l] + arr[r] < n)
	              l++;
	         else // A[i] + A[j] > sum
	              r--;
	    }
	 return result;
	
}
}
