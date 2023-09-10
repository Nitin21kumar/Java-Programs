package Llist;

import java.util.Scanner;

public class SinglyLinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next= next;
		}
	}
	Node head =null;
	
	public void Creation() {
		Scanner sc = new Scanner(System.in);
		int data,n;
		do 
		{
			System.out.println("Enter the data");
			data =sc.nextInt();
			
			Node newNode =new Node(data);
			
			if(head ==null) {
				head = newNode;
			}
			else {
				newNode.next =head;
				head =newNode;
			}
			
			System.out.println("Do you want to continue");
			n =sc.nextInt();
		}
		while(n==1);
			
		
	}
	public void Traverse() {
		if(head==null) {
			
		}
		while(head != null) {
			System.out.println(head.data);
			head =head.next;
		}
		
	}
	
	public static void main(String[] args) {
		SinglyLinkedList ll= new SinglyLinkedList();
		ll.Creation();
		ll.Traverse();
		
	}

}
