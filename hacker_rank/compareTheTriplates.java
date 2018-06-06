import java.util.Scanner;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class compareTheTriplates {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int a0 = in.nextInt();
	int a1 = in.nextInt();
	int a2 = in.nextInt();
	int b0 = in.nextInt();
	int b1 = in.nextInt();
	int b2 = in.nextInt();
	compare(a0,a1,a2,b0,b1,b2);
}

private static void compare(int a0, int a1, int a2, int b0, int b1, int b2) {
	int A = 0,C = 0,E = 0;
	int B = 0,D = 0,F = 0;
	if(a0>b0){
		A=1;
	}
	else if(a0<b0)
		B=1;
	else
		A=B=0;
	if(a1>b1){
		C=1;
	}
	else if(a1<b1)
		D=1;
	else
		D=C=0;
	if(a2>b2){
		E=1;
	}
	else if(a2<b2)
		F=1;
	else
		E=F=0;
	int X=A+C+E;
	int Y=B+D+F;
	System.out.println(X+" "+Y);
	}
	}


