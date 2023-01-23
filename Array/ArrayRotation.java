/******************************************************************************

Two Pointer Minimum and maximum rearrangement in array 


Input: 
    a=1 2 3 4 5 6 7 
    d=2

output: 
    3 4 5 6 7 1 2


Input:
    a=1 6 7 8
    d=3

output:
     8 1 6 7


*******************************************************************************/
import java.util.*;

public class Main
{
    
    public static void rotate(int[] a){
        int t=a[0];
        for(int i=0;i<a.length-1;i++)
        a[i]=a[i+1];
        a[a.length-1]=t;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	int n=0;
	for(String i: s) a[n++]=Integer.parseInt(i);
	int d=x.nextInt();
	while(d!=0){
	    rotate(a);
	    d--;
	}
	for(int i=0;i<n;i++) System.out.print(a[i]+" ");
	}
}
