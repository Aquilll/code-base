import java.util.Scanner;


public class Staircase {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int height = scan.nextInt();
	for(int i = 0; i < height; i++){
		for(int j = 0; j < height; j++){
		if(i + j >= height - 1){
		System.out.print("#");
		}else {
		System.out.print(" ");
		}
		}
		System.out.println();
		}
		}
	
}

