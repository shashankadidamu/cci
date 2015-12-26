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

class issubtree{

static boolean containstree(Node t1, Node t2){
		if(t2==null) //empty tree is always a subtree
			return true;
		return subtree(t1,t2);
}

static boolean subtree(Node tn1,Node tn2){
	if(tn1==null)  //main tree empty , subtree still not found
		return false;

	if(tn1.data == tn2.data){
		if(matchtree(tn1,tn2))
			return true;
	}

	return (subtree(tn1.left,tn2) || subtree(tn1.right,tn2));

}

static boolean matchtree(Node r1, Node r2){
	if(r1==null && r2==null)
		return true;

	if(r1==null || r2==null)
		return false;

	if(r1.data!=r2.data)
		return false;
	return (matchtree(r1.left,r2.left)&& matchtree(r1.right,r2.right));
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

		bst bt2 = new bst();
		bt2.insert(13);
		bt2.insert(10);
		bt2.insert(15);

		System.out.println(containstree(bt1.root,bt2.root));
	}
}





