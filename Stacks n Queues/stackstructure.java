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

class stack{
	Node top;

	void push(int d){
		Node temp=new Node(d);
		temp.next=top;
		top=temp;
	}

	int pop(){
		int temp=0;
		if(top!=null){
			temp=top.data;
			top=top.next;
		}
		return temp;
	}

	int peek(){
		return top.data;
	}
}

class stackstructure{
	public static void main(String[] args){
		stack s1 = new stack();
		s1.push(4);
		s1.push(3);
		s1.push(2);
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1.pop());
		
	}
}