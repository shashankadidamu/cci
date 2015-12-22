//find the kth to last element of a single linked list

class Node {
	
	int data;
	Node next=null;

	public Node(int d){
		data = d;
	}

	void addToTail(int d){
		Node end = new Node(d);
		Node n = this;

		while(n.next!=null){
			n=n.next;
		}

		n.next = end;
	}

	Node delete(Node h, int d){
		Node n = h;
		if(h.data == d){
			return h.next;
		}

		else {
			while(n.next!=null){
				if(n.next.data == d){
					n.next = n.next.next;
					return h;
				}
				n=n.next;
			}
		}
		return h;
	}

	//Iterative
	int kthToLast(Node head, int k){
		Node p1 = head;
		Node p2 = head;

		for(int i=0;i<k-1;i++){
			if(p2==null)
				return 0;
			else 
				p2 = p2.next;
		}


		while(p2.next!=null){
			p1=p1.next;
			p2=p2.next;
		}
		return p1.data;

	}

	//Recursive
	int kthtolastnew(Node head, int k){
		if(head==null)
			return 0;
		int i = kthtolastnew(head.next,k)+1;
		if(i==k)
			System.out.println(head.data);
		return i;
	}
}


class ktolast{
	public static void main(String[] args){
		Node ll = new Node(2);
		ll.addToTail(3);
		ll.addToTail(4);
		ll.addToTail(5);
		ll.addToTail(6);
		ll.addToTail(6);
		System.out.println(ll.kthToLast(ll,3));
		ll.kthtolastnew(ll,3);
	}
}