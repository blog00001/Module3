import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class Reverse{
	Node head=null;
	Node tail;
	Node prev;
void add(int data)
{
	Node NewNode = new Node(data);
	if(head==null){
		head=NewNode;
		tail=head;
		//return;
	}
	else{
		tail.next=NewNode;
		tail=NewNode;
	}
}

void revserse()
{
	if(head==null)
	{
		System.out.println("Empty");
	}
	else{
		Node curr= head;
		 prev = null;
		while(curr!=null)
		{
			Node next1= curr.next;
			curr.next=prev;
			prev=curr;
			curr=next1;
		}
	}
}

void display()
{
	Node temp =prev;
	while(temp!=null)
	{
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}
public static void main(String[] args)
{
	Reverse rev = new Reverse();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no elemnts ");
	int num = sc.nextInt();
	for(int i=0;i<num;i++)
	{
		System.out.println("Enter the elements");
		int k = sc.nextInt();
		rev.add(k);
	}
	//System.out.println("hello");
	rev.revserse();
	rev.display();
}}