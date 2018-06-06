import java.util.Scanner;


public class fibonacci {
public static void main(String[] args) {
	int n;
	Scanner read = new Scanner(System.in);
	n = read.nextInt();
	System.out.println(fibonacci(n));
}

private static int fibonacci(int n) {
	if(n < 0)
		return -1;
	if(n == 1 || n == 0)
		return 1;
	return fibonacci(n-1)+fibonacci(n-2);
}
}
