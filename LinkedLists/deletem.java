//Delete a node in the middle of a singly linked list given only access to that node.

class Node {
	int data;
	Node next=null;

	public Node(int d){
		data = d;
	}

	void addtolast(Node d){
		
		Node n = this;
		while(n.next!=null){
			n=n.next;
		}
		n.next=d;
	}

	Node delete(Node h, int d){
		if(h.data==d){
			return h.next;
		}
		Node n = h;
		while(n.next!=null){
			if(n.next.data == d){
				n.next=n.next.next;
				return h;
			}
			n=n.next;
		}
		return h;
	}

	Node deletemiddle(Node m){
		m.data = m.next.data;
		m.next = m.next.next;
		return m;
	}

	void printlist(Node h){
		while(h!=null){
			System.out.println(h.data);
			h=h.next;
		}
		System.out.println("");
	}
}

class deletem{
	public static void main(String[] args){
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		first.addtolast(second);
		first.addtolast(third);
		first.addtolast(fourth);
		first.addtolast(fifth);
		first.printlist(first);
		third = third.deletemiddle(third);
		first.printlist(first);
	}
}