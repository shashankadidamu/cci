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

     public Node find(Node root,int d){
     	if(root==null)
     		return null;

     	if(root.data==d)
     		return root;
     	else if(d<root.data)
     		return root.left!=null ? find(root.left,d) : null;
     	else if(d > root.data)
     		return root.right!=null ? find(root.right,d) : null;

		return null;
     	
     }

}

class findcommonancestor{

	static boolean covers(Node root, Node p){
		if(root==null)
			return false;
		if(root==p)
			return true;
		return covers(root.left,p) || covers(root.right,p);
	}

	static Node commonAncestorNew(Node root, Node p, Node q){
		
		if(root==null)
			return null;

		if(root==p || root==q)
			return root;

		boolean is_p_on_left = covers(root.left,p);
		boolean is_q_on_left = covers(root.left,q);

		/* if p and q are on different side .. return root */

		if(is_p_on_left != is_q_on_left)
			return root;

		/* else they are on the same side. Traverse this side */

		Node child_side = is_p_on_left ? root.left : root.right;
		return commonAncestorNew(child_side, p, q);
	}

	static Node commonAncestor(Node root, Node p, Node q){
		if(!covers(root,p) || !covers(root,q))
			return null;

		return commonAncestorNew(root,p,q);
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
		Node firstnode = bt1.find(bt1.root, 2);
		Node secondnode = bt1.find(bt1.root, 10);
		Node commonancestornode = commonAncestor(bt1.root, firstnode, secondnode);
		System.out.println(commonancestornode.data);
	}
}




