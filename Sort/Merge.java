/******************************************************************************

Merge sort...

Input:
4
5 2 9 1

output:
1 2 5 9

Input:
8
2 8 1 3 0 2 1 6

Output:
0 1 1 2 2 3 6 8

*******************************************************************************/

import java.util.*;

public class Main
{
    
    public static void merge(int[] a,int l,int m,int h){
        int r=(m-l)+1,c=h-m;
        int[] lft=new int[r];
        int[] rgt=new int[c];
        for(int i=0;i<r;i++) lft[i]=a[l+i];
        for(int i=0;i<c;i++) rgt[i]=a[m+i+1];
        int i=0,j=0,k=l;
        while(i<r && j<c){
            if(lft[i]<=rgt[j]){
                a[k]=lft[i];
                i++;
            }else{
                a[k]=rgt[j];
                j++;
            }
            k++;
        }
        while(i<r) a[k++]=lft[i++];
        while(j<c) a[k++]=rgt[j++];
    }
    
    public static void sort(int[] a,int l,int h){
        if(l<h){
            int m=(l+h-1)/2;
            sort(a,l,m);
            sort(a,m+1,h);
            merge(a,l,m,h);
        }
    }
    
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n=x.nextInt();
	int[] a=new int[n];
	for(int i=0;i<n;i++) a[i]=x.nextInt();
	sort(a,0,n-1);
	for(int i=0;i<n;i++) System.out.print(a[i]+" ");
	}
}
