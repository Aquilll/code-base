import java.util.Random;



public class Searching {
public static void main(String[] args) {
	Random fll=new Random();
	int[] arr = new int[10];
	for(int i=0;i<9;i++){
		arr[i] = fll.nextInt(9);
	}
	int num = fll.nextInt(9);
	LinearSearch(arr , num);
}

private static void LinearSearch(int[] arr, int a) {
	int[] abc=arr;
	int minindex=0;
	int no=a;
	int i;
	for(i=0;i<arr.length;i++){
		if(abc[i]==no){
			minindex=i;
			break;
		}
	}
	if(minindex != 0)
		System.out.println(minindex);
	else
		System.out.println("not in the array");
}

}
