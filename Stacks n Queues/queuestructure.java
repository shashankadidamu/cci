class Node{
	int data;
	Node next;

	public Node(int d){
		data=d;
		next=null;
	}

	public Node(){
		next=null;
	}

}

class Queue{
	Node first,last;

	void enqueue(int d){
		if(first==null){
			first=new Node(d);
			last=first;
		}
		else{
			Node temp=new Node(d);
			last.next=temp;
			last=temp;
		}
	}

	int dequeue(){
		int temp=0;
		if(first!=null){
			temp=first.data;
			first=first.next;
		}
		return temp;
	}
}

class queuestructure{
	public static void main(String[] args){
		Queue q1=new Queue();
		q1.enqueue(2);
		q1.enqueue(3);
		q1.enqueue(4);
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
		System.out.println(q1.dequeue());
	}
}