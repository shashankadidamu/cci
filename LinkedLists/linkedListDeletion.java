class Node {
	
	int data;
	Node next =null;

	public Node(int d){
		data = d;
	}

	void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next!=null){
			n=n.next;
		}
		n.next=end;
	}

	Node delete(Node h,int d){
		Node n=h;
		
		if(n.data==d){
			return h.next;
		}

		while(n.next!=null){
			if(n.next.data==d){
				n.next = n.next.next;
				return h;
			}
			n=n.next;
		}
		return h;
	}

	void print(){

		Node n = this;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
	}
}

class linkedListDeletion{
	
	public static void main(String[] args){

		Node ll = new Node(2);
		ll.appendToTail(4);
		ll.appendToTail(3);
		ll.appendToTail(1);
		ll.print();
		ll=ll.delete(ll,1);
		ll.print();
	}
}