/******************************************************************************
Move all zeros to the end 
Input :  1 2 0 4 3 0 5 0 
Output : 1 2 4 3 5 0 0 0
Input : arr[]  = 1 2 0 0 0 3 6
Output : arr[] = 1 2 3 6 0 0 0
*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	int n=0,t;
	for(String i: s){
	    t=Integer.parseInt(i);
	    if(t!=0) a[n++]=t;
	}
	for(int i: a) System.out.print(i+" ");
	}
}
