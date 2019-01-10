import java.util.Random;


public class BubbleSort {
	public static void main(String[] args) {
		//int arr[] = {4,6,8,12,5};
		Random random = new Random();
		int arr[] = new int[20];
		do{
			for(int i=0;i<20;i++){
				arr[i] = random.nextInt(21) - 10;
			}
			System.out.println("Before sorting");
			printArray(arr);
			sortIt(arr);
			System.out.println("After Sorting");
			printArray(arr);
		}while(arr[0]!=-10 || arr[arr.length-1]!=10);
		
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

	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i]; 
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
