//Basic Single linked-list

class Node {
	Node next = null;
	int data;

	public Node(int d){
		data =d;
	}

	void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next!=null){
			n =n.next;
		}
		n.next=end;
	}

	void print(){
		Node n =this;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
	}
}

class linkedlist {
	public static void main(String[] args){
		Node ll= new Node(3);
		ll.appendToTail(2);
		ll.appendToTail(3);
		ll.print();
	}
}