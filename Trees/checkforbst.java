class Node{
	int data;
	Node left;
	Node right;

	public Node(int d){
		data =d;
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
			root=null;
	}

	public void insert(int d){
		root= insert(root,d);
	}

	private Node insert(Node r, int n){
		if(r==null)
			r=new Node(n);
		else{
			if(n<=r.data)
				r.left=insert(r.left,n);
			else
				r.right=insert(r.right,n);
		}
		return r;
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

class checkforbst{
	static Integer min = Integer.MIN_VALUE;
	static Integer max = Integer.MAX_VALUE;

	static boolean checkbst(Node n){
		return checkbst(n,min,max);
	}

	static boolean checkbst(Node n, Integer mini, Integer maxi){
		if(n==null)
			return true;

		if((mini!=null && n.data <=min) || (maxi!=null && n.data > maxi))
			return false;

		if(! checkbst(n.left,mini,n.data)|| !checkbst(n.right,n.data,maxi))
			return false;
		return true;

	}

	public static void main(String[] args){
		bst bt1 = new bst();
		bt1.insert(5);
		bt1.insert(2);
		bt1.insert(8);
		bt1.insert(9);
		bt1.insert(13);
		bt1.insert(6);
		bt1.insert(10);
		bt1.insert(15);
		System.out.println(checkbst(bt1.root));
	}
}
