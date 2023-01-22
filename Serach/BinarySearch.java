/******************************************************************************
Binary Search
Elements should by in sorted order 
Input: a= 10,20,30,40,50  key=30
Output: 2 
*******************************************************************************/
import java.util.*;


public class Main
{
    static int r=-1;
    public static int BinarySearch(int[] a,int r,int k,int s,int l){
        int m=(l+s)/2;
        if(a[m]==k){ r=m; return r; }
        if(a[m]>k) r=BinarySearch(a,r,k,s,m-1);
        else r=BinarySearch(a,r,k,m+1,l);
        return r;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int k=x.nextInt(),n=0,r=-1;
	int[] a=new int[s.length];
	for(String i: s)
	    a[n++]=Integer.parseInt(i);
	r=BinarySearch(a,r,k,0,a.length-1);
	System.out.print(r);
	}
}
