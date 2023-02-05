/******************************************************************************

Implementation of quick sort....

Input: 8 7 2 43 2 11
Output: 2 2 7 11 8 43

Input: 87 22 35 84 2 
Output: 2 22 35 84 87

*******************************************************************************/
import java.util.*;

public class Main
{
    
    static void sort(int[] a,int s,int e){
        if(s<e){
            int p=partition(a,s,e);
            sort(a,s,p-1);
            sort(a,p+1,e);
        }
    }
    
    static int partition(int[] a,int s,int e){
        int p=a[e];
        int t=s-1;
        for(int i=s;i<=e;i++){
            if(a[i]<p){
                t++;
                int f=a[i];
                a[i]=a[t];
                a[t]=f;
            }
        }
        int f=a[e];
        a[e]=a[t+1];
        a[t+1]=f;
        return t+1;
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String[] s=x.nextLine().split(" ");
	int[] a=new int[s.length];
	int n=0;
	for(String i: s) a[n++]=Integer.parseInt(i);
	sort(a,0,a.length-1);
	for(int i:a) System.out.print(i+" ");
	}
}
