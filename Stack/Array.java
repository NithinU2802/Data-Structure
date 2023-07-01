/******************************************************************************

   Stack implementation using Array.
   
Execution of the program

1. Push
2. Pop 
3. peek
4. print 
5. Exit 

1
45

1
34

1
28

2 
Popped: 28

3 
Peek: 34 

45 34

5


*******************************************************************************/
import java.util.*;

public class Main{
    static int[] Stack=new int[100];
    static int Peek=-1;
    
    void push(int a){
        if(Peek==100)
        System.out.println("Stack OverFlow");
        else
        Stack[++Peek]=a;
    }
    
    int pop(){
        if(Peek==-1){
        System.out.println("Stack UnderFlow");
        return -1;
        }
        return Stack[Peek--];
    }
    
    int peek(){
        if(Peek==-1){
            System.out.print("Empty");
            return Peek;
        }
       return Stack[Peek]; 
    }
    
    void print(){
        if(Peek==-1){
            System.out.print("Empty");
            return;
        }
        int t=Peek+1;
        while(t-->0)
            System.out.println(Stack[t]);
        
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=0,a=0;
	do{ 
	System.out.print("\n1. Push\n2. Pop\n3. peek\n4. print\n5. Exit\n\n");
	n=x.nextInt();
	Main stack=new Main();
	switch(n){
	    case 1:
	        a=x.nextInt();
	        stack.push(a);
	        break;
	    case 2:
	        a=stack.pop();
	        if(a!=-1)
	        System.out.println("Popped: "+a);
	        break;
	    case 3:
	        a=stack.peek();
	        if(a!=-1)
	        System.out.println("Peek: "+a);
	        break;
	    case 4:
	        stack.print();
	        break;
	    case 5:
	        break;
	    default:
	        System.out.println("Invalid Option");
	}
	}while(n!=5);
	}
}
