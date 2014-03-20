package pairwiseSwap;

import java.util.Scanner;

public class pairwiseSwap {
	public static void main(String args[]){
		int option;
		List l=new List();
		while(true){
			System.out.println("Enter your choice");
			System.out.println("1. Insert Begin"+"\n"+"2. swap");
			System.out.println("Enter 0 to exit");
			Scanner sc=new Scanner(System.in);
			option=sc.nextInt();
			switch(option){
			case 1: l.insertBegin();
			l.print();
			break;
			case 2: l.swap();
			l.print();
			break;
			
			case 0:System.exit(0);
			}
		}
	}
}
class List{
	private class Node{
		int data;
		Node next;
	}
	Node head=null;
	public void print(){
		Node n=new Node();
		n=head;
		while(n!=null){
			System.out.print(n.data+"->");
			n=n.next;
		}
	}
	public void swap(){
		Node n=head;
		Node p=head.next;
		int temp=0;
		while(n!=null && n.next!=null){
			temp=n.data;
			n.data=n.next.data;
			n.next.data=temp;
			n=n.next.next;
		}
	}
	public void insertBegin(){
		Node node=new Node();
		if(head==null){
			head=node;
			Scanner sc=new Scanner(System.in);
			head.data=sc.nextInt();
			head.next=null;
		}
		else{
			node.next=head;
			Scanner sc=new Scanner(System.in);
			node.data=sc.nextInt();
			head=node;
		}
	}
}