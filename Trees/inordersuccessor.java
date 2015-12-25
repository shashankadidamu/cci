
//find nextnode (in-order successor) of a givennode in a binary search tree. assume each node has a link to its parent.

	public Node iosuccessor(Node n){
		if(n==null)
			return null;

		if(n.right!=null){
			return leftmost(n.right);
		}
		else{
			Node q= n;
			Node x= q.parent;
			while(x!=null && x.left!=q){
				q=x;
				x=x.parent;
			}
			return x;
		}
	}

	public Node leftmost(Node n){
		if(n=null)
			return null;

		while(n.left!=null)
			n=n.left;
		return n;
	}
