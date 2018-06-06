import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class polynomialMultiplication {
public static void main(String[] args) throws IOException {
	//Scanner scan = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int m =Integer.valueOf(br.readLine());
	int n =Integer.valueOf(br.readLine());
	String mm = br.readLine();
	String nn = br.readLine();
	String p1[] = mm.split(" ");
	String p2[] = nn.split(" ");
	int result[] = multiplyPolynomial(p1 , p2);
	for(int i=0;i<result.length;i++){
		//if(result[i]==0) continue;
		System.out.print(result[i]+"x^"+i+  (i==result.length-1?" ":" + "));
	}
	
	//multiplyPolynomial(p1 , p2 , m , n);
}

private static int[] multiplyPolynomial(String[] p1, String[] p2) {
	int poly1[] = new int[p1.length];
	int poly2[] = new int[p2.length];
	for(int i = 0 ; i<p1.length ; i++){
		poly1[i] = Integer.valueOf(p1[i]);
	}
	for(int j = 0 ; j<p2.length; j++){
		poly2[j] = Integer.valueOf(p2[j]);
	}
	
	return multiplyPolynomialUtil(poly1 , poly2 , p1.length , p2.length);
	
}

private static int[] multiplyPolynomialUtil(int[] p1, int[] p2 , int m , int n) {
	int resultArr[] = new int[m*n];
	for(int i = 0 ; i < p1.length ; i++){
		for(int j = 0 ; j < p2.length ; j++){
			resultArr[j+i] += p1[i]*p2[j];
		}
	}
	return resultArr;
}
}
