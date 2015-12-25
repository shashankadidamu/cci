
//Given BT , Algorithm which creates a linkedlist of all nodes at each depth.


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

class Bt{
	Node root;

	public Bt(){
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

	

}

class btcreatell{

	public static void createll(Node root){
		

		ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
		
		/* "Visit" the root */
		LinkedList<Node> current = new LinkedList<Node>();
		if (root != null) {
			current.add(root);
		}
		
		while (current.size() > 0) {
			result.add(current); // Add previous level
			LinkedList<Node> parents = current; // Go to next level
			current = new LinkedList<Node>(); 
			for (Node parent : parents) {
				/* Visit the children */
				if (parent.left != null) {
					current.add(parent.left);
				}
				if (parent.right != null) {
					current.add(parent.right);
				}
			}
		}

		int depth = 0;
		for(LinkedList<Node> entry : result) {
			Iterator<Node> i = entry.listIterator();
			System.out.print("Link list at depth " + depth + ":");
			while(i.hasNext()){
				System.out.print(" " + ((Node)i.next()).data);
			}
			System.out.println();
			depth++;
		}

	}

	public static void main(String[] args){
		Bt bt1 = new Bt();
		bt1.insert(5);
		bt1.insert(2);
		bt1.insert(8);
		bt1.insert(9);
		bt1.insert(13);
		bt1.insert(6);
		bt1.insert(10);
		bt1.insert(15);
		//bt1.insert(3);
		createll(bt1.root);
		//bt1.inorder();
	}
}