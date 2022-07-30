import java.util.*;
public class String_Question6{
	public static void main(String args[]){
		String s = "[()]{}{[()()]()}";

		if(areBracketsBalanced(s)){
			System.out.println("Balanced");
		}else{
			System.out.println("not Balanced");
		}

		
	}

	public static boolean areBracketsBalanced(String s){
		Deque<Character> stack= new ArrayDeque<Character>();

		for(int i = 0; i<s.length(); i++){

			char x = s.charAt(i);

			if(x =='{' || x == '(' || x == '['){
				stack.push(x);
				continue;
			}

			if(stack.isEmpty())
				return false;
			char check;
			switch(x){
			case ')':
				check = stack.pop();
				if(check == '{' || check == '[')
					return false;
					break;
				
			case ']':
				check = stack.pop();
				if(check == '(' || check == '{')
					return false;
					break;

			case '}':
				check = stack.pop();
				if(check == '[' || check == '(')
					return false;
					break;
				
				}
			}
			return (stack.isEmpty());
	}
}