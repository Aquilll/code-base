
public class maxminArray {
public static void main(String[] args) {
	int[] arr = {111,2,0,-1};
	int result[]= findmaxMin(arr);
	for(int x : result){
		System.out.println(x + " ");	
	}
	
}

private static int[] findmaxMin(int[] arr) {
    int [] result = new int[2];
	int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
    	if(arr[i]<min){
    		min = arr[i];	
    	}
    }
    for(int j=0;j<arr.length;j++){
    	if(arr[j]>max){
    		max = arr[j];		
    	}
    }
    	result[0]=min;
    	result[1]=max;
    	return result;
}
}
