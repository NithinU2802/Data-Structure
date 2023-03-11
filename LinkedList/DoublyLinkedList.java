/******************************************************************************

Element, Display Next and Previous element of a node.....

Input:
4
1 2 3 4

Output:
Current Element: 1 Next Element: 2
Current Element: 2 Next Element: 3 Previous Element: 1
Current Element: 3 Next Element: 4 Previous Element: 2
Current Element: 4 Previous Element: 3


Input:
7
1 2 3 2 3 3 4

Output:
Current Element: 1 Next Element: 2
Current Element: 2 Next Element: 3 Previous Element: 1
Current Element: 3 Next Element: 2 Previous Element: 2
Current Element: 2 Next Element: 3 Previous Element: 3
Current Element: 3 Next Element: 3 Previous Element: 2
Current Element: 3 Next Element: 4 Previous Element: 3
Current Element: 4 Previous Element: 3

*******************************************************************************/

import java.util.*;

class DoublyLinkedList{
static node head=null;
static node tail=null;

static class node{
int a;
node next=null;
node prev=null;
node(int n){
a=n;
next=null;
prev=null;
}
}

public static void print(){
node t=head;
while(t!=null){
System.out.print("Current Element: "+t.a);
if(t.next!=null) System.out.print(" Next Element: "+t.next.a);
if(t.prev!=null) System.out.print(" Previous Element: "+t.prev.a);
System.out.println();
t=t.next;
}
}

public static void main(String[] ar){
Scanner x=new Scanner(System.in);
int n=x.nextInt();
DoublyLinkedList d=new DoublyLinkedList();
node t=null;
for(int i=0;i<n;i++){ 
int a=x.nextInt();
node b=new node(a);
if(i==0){
head=b;
tail=b;
t=b;
}else{
t.next=b;
b.prev=t;
tail=b;
t=b;
}
}
print();
}
}
