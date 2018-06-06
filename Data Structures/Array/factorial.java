import java.util.Scanner;


public class factorial {
public static void main(String[] args) {
	int n;
	Scanner read = new Scanner(System.in);
	n = read.nextInt();
	System.out.println(factorial(n));
}

private static long factorial(int n) {
	long sum=1;
	if(n < 0){
		return -1;
	}
	if(n == 0)
		return 1;
	//return n*factorial(n-1);
	for(long i=n;i>0;i--){
		sum*=i;
	}
	return sum;
}
}
