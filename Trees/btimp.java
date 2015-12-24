
// Alg to check if a binary tree is balanced

import java.util.*;
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

class bt{
	Node root;

	public bt(){
		root=null;
	}
	
	public void insert(int data)
     {
         root = insert(root, data);
     }
     
     /* Function to insert data recursively */
     private Node insert(Node node, int data)
     {
         if (node == null)
             node = new Node(data);
         else
         {
             if (data <= node.data)
                 node.left = insert(node.left, data);
             else
                 node.right = insert(node.right, data);
         }
         return node;
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

	public int height(Node n){
		if(n== null)
			return 0;

		return Math.max(height(n.left),height(n.right))+1;
	}

	public boolean isbalanced(){
		return isbalanced(root);
	}

	private boolean isbalanced(Node temp){
		
		if(temp==null)
			return true;

		int hdiff = height(temp.left)-height(temp.right);
		if(Math.abs(hdiff)>1)
			return false;

		else
			return isbalanced(temp.left) && isbalanced(temp.right);
		
	}

}

class btimp{
	public static void main(String[] args){
		bt bt1 = new bt();
		bt1.insert(5);
		bt1.insert(2);
		bt1.insert(8);
		bt1.insert(9);
		bt1.insert(13);
		bt1.insert(6);
		bt1.insert(10);
		bt1.insert(15);
		//bt1.insert(3);
		System.out.println(bt1.isbalanced());
		bt1.inorder();
	}
}