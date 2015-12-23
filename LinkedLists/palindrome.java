class Node{
	int data;
	Node next=null;

	public Node(int d){
		data=d;
	}
	public Node(){
		next=null;
	}

	void addtotail(int d){
		Node n=this;
		Node end= new Node(d);
		while(n.next!=null){
			n=n.next;
		}
		n.next=end;
	}

	Node addbeginning(int d){
		Node one = new Node(d);
		one.next= this;
		return one;
	}

	Node reversell(){
		Node temp=this;
		Node ll2head=null;
		while(temp!=null){
			if(ll2head==null){
				ll2head= new Node(temp.data);
				temp=temp.next;
			}
			else{
			ll2head=ll2head.addbeginning(temp.data);
			temp=temp.next;
			}
		}
		return ll2head;
	}

	void print(){
		Node n=this;
		while(n!=null){

			System.out.print(n.data+"	");
			n=n.next;
		}
		System.out.println("");
	}

	boolean ispalindrome(Node l1, Node l2){
		while(l1!=null){
			if(l1.data!=l2.data)
				return false;
			l1=l1.next;
			l2=l2.next;
		}
		return true;
	}
}

class palindrome{
	public static void main(String[] args){
		Node ll1 = new Node(2);
		ll1.addtotail(3);
		ll1.addtotail(2);
		ll1.print();
		Node reversedll= ll1.reversell();
		reversedll.print();
		System.out.println(ll1.ispalindrome(ll1,reversedll));	
	}
}