package com.greatlearning.BSToperations;

public class Operations {

	 Node headNode=null;
    Node prevNode=null;
 
	public Node insertion(Node root, int element) {
		
		if(root == null) {
			return new Node(element);
		}
		
		if(element < root.data) {
			root.left = insertion(root.left,element);
		}
		else
			root.right = insertion(root.right,element);
		
		return root;
		
	}
	//inorder of tree
	public void inorder(Node root) {
						
		if(root == null)
			return;
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}

	public void BSTtoSkewed(Node root) {//right skewed tree in increasing order
				
		if(root == null)
			return;
		
		BSTtoSkewed(root.left);
		
		Node rightNode = root.right;
	    Node leftNode = root.left;
		
		if(headNode == null) {
			headNode = root;
			headNode.left = null;
			prevNode = root;
		}
		else {
			prevNode.right = root;
			prevNode.left = null;
			prevNode = root;
		}
		
		BSTtoSkewed(rightNode);
		
		
	      
	}
	public void traverse(Node headNode2) {
		// TODO Auto-generated method stub
		//traversing
		System.out.println("Traversing right skewed tree");
		while(headNode2!=null) {
				System.out.print(headNode2.data+" ");
				headNode2 = headNode2.right;
		}
	}

		

}
