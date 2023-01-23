/******************************************************************************

Two Pointer Minimum and maximum rearrangement in array 


Input: 3 2 1 4 7 6 5

output: 7 1 6 2 5 3 4


Input: 3 4 1 2 6 5

output: 6 1 5 2 4 3


*******************************************************************************/
import java.util.*;

public class Main
{
    public static void sort(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                int t=a[i];
                a[i]=a[i+1];
                a[i+1]=t;
                i=-1;
            }
        }
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] y=x.nextLine().split(" ");
	int[] a=new int[y.length];
	int n=0;
	for(String i: y)
	    a[n++]=Integer.parseInt(i);
	sort(a);
	int[] r=new int[a.length];
	int s=0,l=a.length-1,j=0;
	while(s<=l){
	    r[j++]=a[l];
	    if(s!=l)
	    r[j++]=a[s];
	    s++;
	    l--;
	}
	
	for(int i=0;i<a.length;i++) System.out.print(r[i]+" ");
	}
}
