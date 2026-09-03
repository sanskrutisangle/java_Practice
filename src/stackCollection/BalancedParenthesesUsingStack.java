package stackCollection;
import java.util.Stack;

public class BalancedParenthesesUsingStack {
	public static boolean isBalanced(String str) {
		 Stack<Character> stack = new Stack<>();
		 for (int i = 0; i < str.length(); i++) {
			 char ch=str.charAt(i);
			 
			 if(ch=='['|| ch=='{'||ch=='(') {
				 stack.push(ch);
			 }else if(ch == ')' || ch == '}' || ch == ']') {
				 if (stack.isEmpty()) {
	                    return false;
				 }
				 char top = stack.pop();

	                // Check matching brackets
	                if ((ch == ')' && top != '(') ||
	                    (ch == '}' && top != '{') ||
	                    (ch == ']' && top != '[')) {

	                    return false;
	                }
	            }
	        }

	        // Stack must be empty at the end
	        return stack.isEmpty();
			 }
		 
	
	public static void main(String[] args) {
		Stack<Character>stack=new Stack<>();
		
		 String str1 = "{[()]}";
	        String str2 = "{[(])}";

	        System.out.println(isBalanced(str1)); // true
	        System.out.println(isBalanced(str2)); // false
	}

}
