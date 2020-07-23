package assignments;

public class check_parenthesis {
	public class Main {
	    static Scanner scn =new Scanner(System.in);
	    public static void main(String args[]) {
	       String str=scn.nextLine();
	       System.out.println(check(str));
	       
	    }
	    public static boolean check(String str)
	    {
	        Stack<Character>stack =new Stack();
	        for(int i=0;i<str.length();i++)
	        {
	            if(str.charAt(i)!=')')
	            {
	                stack.push(str.charAt(i));
	            }
	            else
	            {
	                if(stack.peek()=='(')
	                {
	                    return true;
	                }
	                while(stack.peek()!='(')
	                {
	                    stack.pop();
	                }
	                stack.pop();
	            }
	        }
	        return false;
	        
	    }
	}

}
