
public class mergeArray {
public static void main(String[] args) {
	int[] mPlusN={2,8,3,-1,-1,-1,-1,15,20};
	int[] N={5,7,9,25};
	int n=N.length;
	int m = mPlusN.length-n;
	arrangingatEnd(mPlusN,m+n);
	merge(mPlusN,N,m,n);
	printArray(mPlusN);
}

private static void printArray(int[] mPlusN) {
	for(int i : mPlusN)
		System.out.print(i+" ");
	
}

private static void merge(int[] mPlusN, int[] N, int m, int n) {
	int i = n;
	int j=0;
	int k=0;
	while(k<(m+n)){
		if((i<(m+n)&&mPlusN[i]<=N[j])||(j==n)){
			mPlusN[k]=mPlusN[i];
			k++;
			i++;
		}
		else{
			mPlusN[k]=N[j];
			k++;
			j++;
		}
	}
	
}

private static void arrangingatEnd(int[] mPlusN, int size) {
	int j =size-1;
	for(int i=size-1;i>=0;i--){
		if(mPlusN[i]!=-1){
		mPlusN[j]=mPlusN[i];
		j--;
		}
	}
}
}
