
Node commonAncestor(Node root, Node p, Node q){
	if(!covers(root,p) || !covers(root,q))
		return null;

	return commonAncestorNew(root,p,q);
}

Node commonAncestorNew(Node root, Node p, Node q){
		
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

boolean covers(Node root, Node p){
	if(root=null)
		return false;
	if(root=p)
		return true;
	return covers(root.left,p) || covers(root.right,p);
}