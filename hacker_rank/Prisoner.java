import java.util.Scanner;


public class Prisoner {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int count = 0;
	int t = 0;
	int i = 0;
	int k=0;
	int l=0;
	int q=0;
	int m = scan.nextInt();
	int n = scan.nextInt();
	int s = scan.nextInt();
	for(i = s; i <= n; s++){
		count++;
		k=s;
		if(k>=m+1){
			break;
		}
	}
	n=n-count;
	for(t = 1; t <= n ; t++){
		l = t;
		if(l>=m+1){
			break;
		}
	}
	n=n-(t-1);
	for(int p = 1; p <= n; p++){
		q=p+1;
	}
	System.out.println(q);
}
}
