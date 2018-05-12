package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;
import treeInterfaces.Position;

public class CloneBinaryTreeTester {

	public static void main(String[] args) throws CloneNotSupportedException { 

		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>();
		LinkedBinaryTree<Integer> tEmpty = t.clone();
		
		t.addRoot(4);
		Position<Integer> right = t.addLeft(t.root(), 9);
		t.addRight(right, 10);
		t.addLeft(right, 7);
		Position<Integer> left = t.addRight(t.root(), 20);
		right = t.addLeft(left, 15);
		t.addLeft(right, 12);
		right = t.addRight(right, 17);
		t.addLeft(right, 19);
		left = t.addRight(left, 21);
		left = t.addRight(left, 40);
		t.addLeft(left, 30);
		t.addRight(left, 45);
		
		LinkedBinaryTree<Integer> tClone = t.clone();

		// display content as a tree
		Utils.displayTree("The structure of the tree is: ", t);
		
		// display elements as a list
		Utils.displayTreeElements("The elements of the tree are: ", t);
		
		// display content as a tree
		Utils.displayTree("The structure of the empty clone tree is: ", tEmpty);
						
		// display elements as a list
		Utils.displayTreeElements("The elements of the empty clone tree are: ", tEmpty);
		
		// display content as a tree
		Utils.displayTree("The structure of the clone tree is: ", tClone);
				
		// display elements as a list
		Utils.displayTreeElements("The elements of the clone tree are: ", tClone);
	}
}
