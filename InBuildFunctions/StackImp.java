/******************************************************************************

Stack Inbuild function of Java 

Input:
4 
1 2 3 4

Output:
peek: 4 

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	Stack<Integer> a=new Stack<>();
	for(int i=0;i<n;i++) a.push(x.nextInt());
	System.out.println("Peek: "+a.peek());
	System.out.println("Pop: "+a.pop());
	System.out.println("Elements are: ");
	a.forEach((e)->System.out.print(e+" "));
	}
}
