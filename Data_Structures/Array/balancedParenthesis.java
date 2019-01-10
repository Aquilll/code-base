import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class balancedParenthesis {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.valueOf(br.readLine());
	while(N-- > 0){
		String parentheses = br.readLine();
		checkIfBalanced(parentheses);
	}
}

private static void checkIfBalanced(String parentheses) {
	
	Stack<Character> stack = new Stack<Character>();
	//iterating string
	for(char c : parentheses.toCharArray()){
		if(c == '{'){
			stack.push(c);
		}else{
			if(stack.isEmpty()){
				System.out.println(parentheses + "is not balanced");
				return;
			}
			stack.pop();
		}
	}
	if(stack.isEmpty()){
		System.out.println(parentheses + "is balanced");
		
	}else{
		System.out.println(parentheses + "is not balanced");
	}

}
}
