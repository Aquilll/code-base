public class Adding {
public static void main(String[] args) {
	int num=0;
	for(int i=0; i<args.length; i++){
	   num+= Integer.valueOf(args[i]);
	}

	  System.out.println("The sum is " + num);}
}
