package com.greatlearning.BSToperations;

import java.util.Scanner;

public class MainClassBST {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Operations op = new Operations();
		Node node;
		int cont;
		int element;
		Node root =null;
		boolean flag = true;
		
		System.out.println("First create tree before performing any operation on tree \n");
		
	/*	while(flag) {
			
			System.out.println("Enter the element into tree: ");
			element = sc.nextInt();
			root =op.insertion(root,element);
			System.out.println("Press 1 to continue else 0 to stop");
			cont = sc.nextInt();
			if(cont == 1)
				flag = true;
			else
				flag = false;
			
		}    */
		
		root = op.insertion(root, 50);
		root = op.insertion(root, 30);
		root = op.insertion(root, 10);
		root = op.insertion(root, 60);
		root = op.insertion(root, 55);
		
		
		System.out.println("Inorder of tree");
	    op.inorder(root);
		System.out.println();
		
		op.BSTtoSkewed(root);
		
		op.traverse(op.headNode);
		
	}

	

}
