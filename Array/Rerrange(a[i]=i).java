/******************************************************************************

Rearrange an array such that arr[i] = i

Input: -1 -1 6 1 9 3 2 -1 4 -1

Output: -1 1 2 3 4 -1 6 -1 -1 9


Input: 19 7 0 3 18 15 12 6 1 8 11 10 9 5 13 16 2 14 17 4

Output: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[1001];
	Arrays.fill(a,-1);
	int n=0,m=-1;
	for(String i: s){ 
	    int b=Integer.parseInt(i);
	    if(b<0) continue;
	    a[Integer.parseInt(i)]=Integer.parseInt(i);
	    if(b>m) m=b;
	}
	for(int i=0;i<=m;i++) System.out.print(a[i]+" ");
}
}
