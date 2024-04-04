/******************************************************************************

    Queue Implementations in java

*******************************************************************************/
import java.util.*;


class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class Queue{
    
    static Node head=null,prev=null;
    static Scanner x=new Scanner(System.in);
    
    public void create(){
        System.out.print("Enter Size of the Queue: ");
        int n=x.nextInt();
        for(int i=0;i<n;i++){
            Node node=new Node(x.nextInt());
            if(i==0)
                head=node;
            else
                prev.next=node;
            prev=node;
        }
    }
    
    public int poll(){
        int d=head.data;
        head=head.next;
        return d;
    }
    
    public void offer(int a){
        if(prev==null){
            System.out.println("Queue is Empty");
        }
        Node node=new Node(a);
        prev.next=node;
        prev=node;
    }
    
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
}

public class Queue_LinkedList
{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int ch=-1;
		Queue queue=new Queue();
		while(ch!=5){
    		System.out.println("\nQUEUE IMPLEMENTATION");
	    	System.out.println("1.Create\n2.Poll\n3.offer\n4.Exit");
	    	System.out.print("Enter Your Choice: ");
	    	ch=x.nextInt();
	    	switch(ch){
	    	    case 1:
	    	        queue.create();
	    	        break;
	    	    case 2:
	    	        queue.poll();
	    	        break;
	    	    case 3:
	    	        System.out.print("Enter the Value: ");
	    	        queue.offer(x.nextInt());
	    	        break;
	    	    case 4:
	    	        queue.print();
	    	        break;
	    	    case 5:
	    	        break;
	    	    default:
	    	        System.out.println("Invalid Option..!");
	    	}
		}
	}
}
