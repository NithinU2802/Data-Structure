/******************************************************************************

Selection Sort for the given array...

Input: 64 25 12 22 11

output: 11 12 22 25 64


*******************************************************************************/
import java.util.*;

public class Main
{
     static void swap(int[] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	int n=0;
	for(String i: s) a[n++]=Integer.parseInt(i);
	for(int i=0;i<n-1;i++){
	    int t=i;
	    for(int j=i+1;j<n;j++){
	        if(a[j]<a[t]) t=j;
	    }
	    
	    //call by value whereas it doesn't support call by reference
	    if(t!=i) swap(a,i,t);
	}
	for(int i: a) System.out.print(i+" ");
	}
}
