
public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {5,7,3,0,4,8};
		System.out.println("Before sorting");
		printArray(arr);
		sortIt(arr);
		System.out.println("After Sorting");
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		for(int x:arr)
			System.out.print(x+" ");
		System.out.println();
		
	}

	private static void sortIt(int[] arr) {
		Linearsearch(int[] arr, int num);
		int minimumIndex=0;
		int i,j;
		int min =0;
		for(i=0;i<arr.length;i++){
			min = arr[i];
			minimumIndex=i;
			for(j=i+1;j<arr.length;j++){
				if(arr[j]<min){ 
					min = arr[j];
					minimumIndex=j;
				}
			}
			swap(arr,i,minimumIndex);
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i]; 
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
