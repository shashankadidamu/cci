class Node{
	int data;
	Node left;
	Node right;

	public Node(int d){
		data=d;
		left=null;
		right=null;
	}

	public Node(){
		left=null;
		right=null;
	}
}

class bst{
	Node root;

	public bst(){
		root=new Node();
	}
	public bst(int d){
		root= new Node(d);
	}

	void constructbst(int[] arr,int low,int high){

		/*if(high<low)
			return null;
		int mid = (low+high)/2;
		Node n = new Node(arr[mid]);
		n.left= constructbst(arr, low, mid);
		n.right= constructbst(arr, mid+1, high);
		return n;*/

		
		if(low<high){

			int mid= (low+high)/2;
			insert(root, arr[mid]);
			constructbst(arr, low, mid);
			constructbst(arr, mid+1, high);
		}
	}

	Node insert(Node n,int d){
		if(n ==null)
			n =new Node(d);
		else{
			if(d< n.data)
				n.left= insert(n.left,d);
			else
				n.right= insert(n.right,d);
		}
		return n;

	}

	public void inorder()
     {
         inorder(root);
     }
     private void inorder(Node r)
     {
         if (r != null)
         {
             inorder(r.left);
             System.out.print(r.data +" ");
             inorder(r.right);
         }
     }
}

public class bstminheight{
	public static void main(String[] args){
		int[] a = {1,2,3,4,5,6,7,8,9};
		
		bst b = new bst();
		b.constructbst(a, 1, 9);
		b.inorder();
	}
}

