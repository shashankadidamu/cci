// Remove duplicates from an unsorted linkedlist, no temporary buffer 
import java.util.*;

class Node {
	
	int data;
	Node next = null;

	public Node(int d){
		data=d;
	}

	void appendToTail(int d){

		Node end= new Node(d);
		Node n = this;

		while(n.next!=null){
			n = n.next;
		}
		n.next=end;

	}

	Node delete(Node head, int d){
		Node n = head;

		if(head.data == d){
			return head.next;

		}
		while(n.next!=null){
			if(n.next.data == d){
				n.next = n.next.next;
				return head;
			}
			n=n.next;
		}
		return head;
	}

	void llprint(){
		Node n= this;
		System.out.println("");
		while(n!=null){
			System.out.print(" "+n.data);
			n=n.next;
		}
		System.out.println("");

	}	

	void deleteDuplicates(Node head){
		Node current = head;

		while(current!= null){
			Node runner = current;
			while(runner.next!=null){
				if(runner.next.data == current.data){
					runner.next = runner.next.next;
				}
				else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

	void deleteDuplicatesNew(Node n){
		Hashtable table= new Hashtable();
		Node previous = null;
		while(n != null){
			if(table.containsKey(n.data)){
				previous.next = n.next;
			}
			else{
				table.put(n.data, true);
				previous = n;
			}
			n=n.next;
		}
	}
}

class removeDuplicates {
	
	public static void main(String[] args){
		int max = 10;
		int min = 1;
		Random rand = new Random();
		int num,i=1;
		Node ll = new Node(2);
		while(i<11){
			num = rand.nextInt((max-min)+1)+min;
			ll.appendToTail(num);
			i++;
		} 
		ll.llprint();
		ll.deleteDuplicatesNew(ll);
		ll.llprint();

		while(i<15){
			num = rand.nextInt((max-min)+1)+min;
			ll.appendToTail(num);
			i++;
		} 
		ll.llprint();
		ll.deleteDuplicates(ll);
		ll.llprint();
	}
}