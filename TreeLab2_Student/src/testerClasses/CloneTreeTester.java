package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedTree;
import treeInterfaces.Position;

public class CloneTreeTester {

	public static void main(String[] args) throws CloneNotSupportedException { 

		LinkedTree<Integer> t = new LinkedTree<>();
		LinkedTree<Integer> tEmpty = t.clone();
		
		t.addRoot(4);
		Position<Integer> right = t.addChild(t.root(), 9);
		t.addChild(right, 7);
		t.addChild(right, 10);
		Position<Integer> left = t.addChild(t.root(), 20);
		right = t.addChild(left, 15);
		t.addChild(right, 12);
		right = t.addChild(right, 17);
		t.addChild(right, 19);
		left = t.addChild(left, 21);
		left = t.addChild(left, 40);
		t.addChild(left, 30);
		t.addChild(left, 45); 
		
		LinkedTree<Integer> tClone = t.clone();

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
