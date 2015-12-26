// Alg to find if there is a path from root to leaf with a given sum

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

	bst(){
		root=null;
	}

	public void insert(int d){
		root=insert(root,d);
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

class path{

	static boolean haspathsum(Node root, int sum){
		if(root==null)
			return false;
		if(root.data==sum){
			if (root.left==null && root.right ==null)
				return true;
		}
		return (haspathsum(root.left, sum-root.data) || haspathsum(root.right, sum-root.data)); 
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
		System.out.println(haspathsum(bt1.root, 19));
	}
}