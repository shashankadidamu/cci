class Node {
	
	int data;
	Node next = null;

	public Node(int d){
		data=d;
	}
	public Node(){
			next=null;
	}

	

	void addtoend(Node d){
		Node n=this;
		while(n.next!=null){
			n=n.next;
		}
		n.next=d;
	}


	void print(){
		Node n = this;
		while(n!=null){
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println("");
	}

	Node partition(Node h, int x){
		Node beforestart=null;
		Node beforeend=null;
		Node afterstart=null;
		Node afterend=null;

		while(h!=null){
			Node temp = h.next;
			h.next=null;
			if(h.data<x){
				if(beforestart==null){
					beforestart=h;
					beforeend=beforestart;
				}
				else{
					beforeend.next=h;
					beforeend=h;
				}
			}
			else{
				if(afterstart==null){
					afterstart=h;
					afterend=afterstart;
				}
				else{
					afterend.next=h;
					afterend=h;
				}			
			}
			h=temp;
		}
		if(beforestart==null)
			return afterstart;
		beforeend.next=afterstart;
		return beforestart;
	}
}

class arrange{
	public static void main(String[] args){
		Node first= new Node(5);
		Node second = new Node(10);
		Node third = new Node(3);
		Node fourth= new Node(2);
		first.addtoend(second);
		first.addtoend(third);
		first.addtoend(fourth);
		first.print();
		Node sorted = first.partition(first,4);
		sorted.print();
	} 
}