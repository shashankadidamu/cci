class Node{
	int data;
	Node next=null;

	public Node(int d){
		data=d;
	}

	void addtolist(int d){
		
		Node temp=this;
		if(temp==null){
			this.data=d;
			this.next=null;
		}
		else{
			Node n = new Node(d);
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=n;
		}
	}

	void print(){
		Node temp=this;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	Node addition(Node l1,Node l2){
		Node lsum=null;
		int result;
		int carry=0;
		while(l1!=null || l2!=null){
			if(l1==null)
				result= l2.data+carry;
			else if(l2==null)
				result=l1.data+carry;
			else
				result=l1.data+l2.data+carry;

			carry= result/10;
			if(lsum==null){
				lsum=new Node(result%10);
			}
			else
				lsum.addtolist(result%10);
			if(l1.next==null && l2.next==null && carry >0)
				lsum.addtolist(carry);
			l1=l1.next;
			l2=l2.next;
		}
		return lsum;
	}
}

class sum{
	public static void main(String[] args){
		Node list1=new Node(7);
		list1.addtolist(1);
		list1.addtolist(6);
		Node list2=new Node(5);
		list2.addtolist(9);
		list2.addtolist(2);
		list1.print();
		list2.print();
		Node listsum= list1.addition(list1,list2);
		listsum.print();
	}
}