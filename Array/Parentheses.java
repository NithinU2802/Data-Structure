/******************************************************************************

Remove unbalanced parentheses in a given expression.

    Eg.) Input  : ((abc)((de))
         Output : ((abc)(de))  

         Input  : (((ab)
         Output : (ab) 

*******************************************************************************/
import java.util.*;

public class Parentheses
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	Stack<Character> stack=new Stack<Character>();
	String result="",res="";
	for(int i=0;i<s.length();i++){
	    if(Character.isAlphabetic(s.charAt(i)))
	        res+=s.charAt(i);
	    else if(s.charAt(i)=='(')
	        stack.push('(');
	    else if(s.charAt(i)==')'){
	        if(!stack.isEmpty() && !res.equals("")){
	            stack.pop();
	            result+='('+res+')';
	        }else  
	            result+=res;
	        res="";
	    }
	}
	int n=stack.size();
	while(n>0){
	    result='('+result+')';
	    n-=2;
	}
	System.out.println(result);
	        
	}
}
