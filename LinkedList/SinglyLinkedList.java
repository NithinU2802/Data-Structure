/******************************************************************************

SinglyLinked List to get and print the value...

Input:
4
1 2 3 4
 
Output:
1 2 3 4 

Input:
6
1 2 3 4 2 9

Output:
1 2 3 4 2 9

*******************************************************************************/

import java.util.*;

class SinglyLinkedList{
public static node h=null;
public static node t=null;
static class node{
int d;
node next=null;
node(int b){
d=b;
next=null;
}
}

public static void print(){
node n=h;
while(n!=null){
System.out.print(n.d+" ");
n=n.next;
}
}


public static void main(String[] arg){
Scanner x=new Scanner(System.in);
int n=x.nextInt();
int[] a=new int[n];
SinglyLinkedList lst=new SinglyLinkedList();
for(int i=0;i<n;i++){
int dt=x.nextInt();
node b =new node(dt);
if(h==null){
h=b;
t=b;
}else{
t.next=b;
t=b;
}
}
print();
}

}
