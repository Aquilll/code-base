
public class mergesort {
public static void main(String[] args) {
	int arr[] = {-4,0,8,3,-55};
	int start = 0;
	int end = arr.length - 1;
	mergesort(arr,start,end);
	for(int x : arr)
		System.out.print(x+" ");
}

private static void mergesort(int[] arr, int start, int end) {
	if(start<end){
		int middle = (start + end)/2;
		mergesort(arr,start,middle);
		mergesort(arr,middle+1,end);
		merge(arr,start,middle,end);
		
	}
	
}

private static void merge(int[] arr, int start, int middle, int end) {
	//System.out.println("Start " + start + " Middele " + middle + " End " + end);
	//printArray(arr);
	//System.out.println();
	/*if(start == 3 && middle == 3 && end == 4)
	{
		System.out.println("sart middle end");
	}*/
	int temp[] = new int[end - start + 1];
	int i = start;
	int j = middle + 1;
	int k = 0;
	if(start < end){
		while(i<=middle && j<=end){
			if(arr[i] < arr[j]){
				temp[k++]=arr[i++];
			}
			else
				temp[k++]=arr[j++];
		}
		while(i <= middle){
			temp[k++] = arr[i++];
		}
		while(j <= end){
			temp[k++]=arr[j++];
		}
		for(int l=0;l<temp.length;l++){
			arr[start+l]= temp[l];
		}
	}
	}
}
