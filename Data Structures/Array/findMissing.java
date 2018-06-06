import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class findMissing {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		while(N-->0){
			int size = Integer.valueOf(br.readLine());
			String input  = br.readLine();
			String[] arr = input.split(" ");
			int x = findMissingIterative(arr,size);
			System.out.println("Missing no is (Iterative) " + x);
			int y = findMIssingOptimal(arr,size);
			System.out.println("Missing no is (Optimal) " +y);
		}
	}

	private static int findMIssingOptimal(String[] arr, int size) {
		int sum = (size*(size+1))/2;
		int arrSum= findArrsum(arr);
		int missingno = sum - arrSum;
		return missingno;
	}

	private static int findArrsum(String[] arr) {
		int sum=0;
	    for(String s : arr){
	    	sum = sum + Integer.valueOf(s);
	    }
		return sum;
	}

	private static int findMissingIterative(String[] arr, int size) {
		boolean flag=false;
		int missingNo=-1;
		for (int i = 0 ; i<=size ; i++){
			for(int j = 0 ;  j<arr.length ; j++){
				if(Integer.valueOf(arr[j]) == i){
					flag=true;
					break;
				}
			}
		if(flag!=true){
			missingNo=i;
			return missingNo;
		}
		else flag = false;
		}
		return missingNo;
	}
		
}
